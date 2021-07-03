package application;

import java.io.File;
import java.io.FileInputStream;
import java.util.Vector;

/**
 *  JCraft's JSCH library for SSH into the server
 */
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

/**
 * Concrete class that gives the developer a variety of options for connecting
 * to a remote server, uploading and downloading files, and basic IO
 */
public class User implements Print {

	private String host;
	private Integer port;
	private String user;
	private String password;

	private JSch jsch;
	private Session session;
	private Channel channel;
	private ChannelSftp sftpChannel;

	/**
	 * Constructor for creating an object that holds user information
	 */
	public User(String host, Integer port, String user, String password) {
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
	}

	/**
	 * Function that implements interface Print
	 */
	@Override
	public void print() {
		System.out.println("FACADE/");
		System.out.println("host " + host);
		System.out.println("prt " + port);
		System.out.println("user " + user);
		System.out.println("pass " + password);
		System.out.println("/FACADE END");
	}

	/**
	 * Initializes session and channels, using user information to open a pathway
	 * from the program to the server
	 */
	public void connect() {
		try {
			jsch = new JSch();
			session = jsch.getSession(user, host, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password);
			session.connect();

			channel = session.openChannel("sftp");
			channel.connect();
			sftpChannel = (ChannelSftp) channel;

		} catch (JSchException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Is used to check for file existence at any point
	 */
	private static boolean exists(ChannelSftp channelSftp, String path) {
		Vector res = null;
		try {
			res = channelSftp.ls(path);
		} catch (SftpException e) {
			if (e.id == ChannelSftp.SSH_FX_NO_SUCH_FILE) {
				return false;
			}
			System.out.println("Unexpected exception during ls files on sftp: [{}:{}]" + e.id + e.getMessage());
		}
		return res != null && !res.isEmpty();
	}

	/**
	 * Disconnects all channels and sessions, closing the pathway
	 */
	public void disconnect() {
		System.out.println("disconnecting...");
		sftpChannel.disconnect();
		channel.disconnect();
		session.disconnect();
	}

	/**
	 * Takes a filename and destination and creates a file. Then it uploads the file
	 * at the destination specified.
	 */
	public void upload(String fileName, String remoteDir) {

		FileInputStream fis = null;
		connect();
		try {
			// Change to output directory
			sftpChannel.cd(remoteDir);
			// System.out.println("Change Dir Work: " + remoteDir);

			// Upload file
			System.out.print("FILE EXISTENCE " + exists(sftpChannel, remoteDir));
			File file = new File(fileName);
			fis = new FileInputStream(file);
			System.out.println(" FILE:" + fileName);
			sftpChannel.put(fis, file.getName());

			fis.close();
			System.out.println("File uploaded successfully - " + file.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		}
		disconnect();
	}

}
