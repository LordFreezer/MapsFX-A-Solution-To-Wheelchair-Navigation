package application;

import java.awt.Desktop;
import java.awt.Dimension;
/** 
 * File reading and writing libraries
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
/**
 * List libraries 
 */
import java.util.ArrayList;
import java.util.List;

/**
 *  JSON.simple user library for converting variables into JSON objects
 */
import org.json.simple.JSONObject;

/**
 *  Java FX user library for enhanced GUI development
 */
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Transfer extends Application {
	/**
	 * Entry point into the application.
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	/**
	 * Function that groups all server activities in a single function call.
	 */
	private void ssh() {
		/**
		 * Path to the folder that is available for anyone to see on the web.
		 */
		String remotePath = "/home/gq/jf024/public_html/";
		/**
		 * Object that holds account information for SSH into cs2.
		 */
		User ftp = new User("comsc.uco.edu", 22, "jf024", "wfuajw");
		/**
		 * Text files that are uploaded to the server.
		 */
		ftp.upload("data.txt", remotePath);

		ftp.upload("mode.txt", remotePath);
		/**
		 * Object prints user information to the console.
		 */
		Display user = new Display(ftp);
		user.printUserInfo();
	}

	/**
	 * Function that reads bool.txt from the server and parses the text from String
	 * to boolean.
	 */
	private boolean readBool() throws IOException {
		/**
		 * Reader that reads multiple of lines of text in a .txt file and saves it in a
		 * String. Quite overkill for this application but, "hey it works!"
		 */
		BufferedReader br = new BufferedReader(new FileReader("bool.txt"));
		String everything;
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();
		}
		/**
		 * Boolean that is parsed from a String and returned
		 */
		boolean bool = Boolean.parseBoolean(everything);
		return bool;
	}

	/**
	 * Function that populates an Observable List given a List of Waypoint. Note
	 * that a Waypoint is just a 2 ordered tuple of a String and Coordinate. This
	 * just strips the Coordinate member and returns an Observable List of Strings
	 */
	private ObservableList<String> populateChecks(List<Waypoint> names) {
		ObservableList<String> list = FXCollections.observableArrayList();
		for (int i = 0; i < names.size(); i++) {
			list.add(names.get(i).getName());
		}
		return list;
	}

	/**
	 * Function that writes to files that stay in the Project file in Eclipse's
	 * Workspace
	 */
	private void localWriteToFile(String bool) throws IOException {

		/**
		 * Clears bool.txt
		 */
		try (FileOutputStream writer = new FileOutputStream("bool.txt");) {
			writer.write(("").getBytes());
			writer.close();
		} catch (IOException e) {
			System.out.println("error on delete to bool.txt");
		}

		/**
		 * Writes literal String to file. No need to create a JSON object.
		 */
		try (FileWriter fw = new FileWriter("bool.txt", true);
				BufferedWriter bww = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bww)) {
			out.println(bool);
			out.close();
		} catch (IOException e) {
			System.out.println("error on write to bool.txt");
		}
	}

	/**
	 * Function that writes to files that are meant to be sent over to CS2.
	 */
	private void serverWriteToFile(Waypoints buildingList, boolean handicapToggle) throws IOException {
		/**
		 * Writes building information to data.txt
		 */
		File fout = new File("data.txt");
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		/**
		 * Note the format that the data is being written. This writes the building
		 * information as embedded HTML that can be echoed with directions.php on the
		 * server side.
		 */
		for (int i = 0; i < buildingList.size(); i++) {
			bw.write("value=" + buildingList.get(i).getStart().getLat() + "," + buildingList.get(i).getStart().getLong()
					+ ">" + buildingList.get(i).getName());
			bw.newLine();
		}
		bw.close();

		/**
		 * This creates a JSON object that stores the mode of transportation for the
		 * Directions API call. It is read from file server side with an AJAX call
		 * JQuery.get .
		 */
		String mode = (handicapToggle) ? "BICYCLING" : "WALKING";
		JSONObject obj = new JSONObject();
		obj.put("mode", mode);

		/**
		 * Clears mode.txt
		 */
		try (FileOutputStream writer = new FileOutputStream("mode.txt");) {
			writer.write(("").getBytes());
			writer.close();
		} catch (IOException e) {
			System.out.println("error on delete to mode.txt");
		}

		/**
		 * Writes the mode of transportation as JSON to mode.txt
		 */
		try (FileWriter fw = new FileWriter("mode.txt", true);
				BufferedWriter bww = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bww)) {
			out.println(obj);
			out.close();
		} catch (IOException e) {
			System.out.println("error on write to mode.txt");
		}

		/**
		 * Uploads the files to the server.
		 */
		ssh();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage) throws Exception {
		// ITEMS ------------------------------------

		stage.setTitle("Map application");
		/**
		 * Password field for admin control panel.
		 */
		final Label message = new Label("");
		Label label1 = new Label("Admin Password:");
		Label label2 = new Label("WheelChair User:");
		final PasswordField pb = new PasswordField();
		pb.setVisible(false);
		label1.setVisible(false);

		/**
		 * Link for Demonstration Video
		 */
		Hyperlink link = new Hyperlink();
		link.setText("Demostration Video With Documentation");

		/**
		 * Web "stuff" for loading directions.php from the server.
		 */
		WebView myWebView = new WebView();
		WebEngine engine = myWebView.getEngine();

		/**
		 * Buttons that control addition and removal of buildings from the server.
		 */
		Button remove = new Button("");
		remove.setVisible(false);
		Button add = new Button("");
		add.setVisible(false);
		/**
		 * Button when pressed hides admin panel options for user
		 */
		Button hide = new Button("");
		hide.setVisible(false);

		/**
		 * List that populates the ComboBox that dictates which list is used throughout
		 * the app.
		 */
		ObservableList<String> choicesWheelchair = FXCollections.observableArrayList();
		choicesWheelchair.add("Yes");
		choicesWheelchair.add("No");
		final ComboBox toggle = new ComboBox(choicesWheelchair);
		toggle.setPromptText("Wheelchair?");

		/**
		 * Empty lists that are passed to the Waypoints constructor on creation of
		 * handicapKill and nonHandicapKill lists respectively.
		 */
		List<Waypoint> emptyHandicapList = new ArrayList<Waypoint>();
		List<Waypoint> emptyNonHandicapList = new ArrayList<Waypoint>();

		/**
		 * List of non-handicap accessible doors.
		 */
		List<Waypoint> nonHandicapList = new ArrayList<Waypoint>();
		nonHandicapList.add(new Waypoint("Nigh Center", new Coordinate(35.65424120670842, -97.47144378040936)));
		nonHandicapList.add(new Waypoint("Math and Computer Science Building",
				new Coordinate(35.654385723413604, -97.4727779330929)));
		nonHandicapList.add(new Waypoint("Thatcher Hall", new Coordinate(35.6557125742274, -97.47055093961345)));
		nonHandicapList.add(new Waypoint("Liberal Arts", new Coordinate(35.65634649819341, -97.46861962638773)));

		/**
		 * List of handicap accessible doors.
		 */
		List<Waypoint> handicapList = new ArrayList<Waypoint>();
		handicapList.add(new Waypoint("Nigh Center", new Coordinate(35.655342557795144, -97.47139945884912)));
		handicapList.add(new Waypoint("Math and Computer Science Building",
				new Coordinate(35.6540821083754, -97.47322744936858)));
		handicapList.add(new Waypoint("Thatcher Hall", new Coordinate(35.65604926380739, -97.47051309595297)));
		handicapList.add(new Waypoint("Liberal Arts", new Coordinate(35.656535531351594, -97.46815713897928)));

		/**
		 * Waypoints object variants of the lists above. Allows the use of custom
		 * operations for adding and removing buildings.
		 */
		Waypoints non = new Waypoints(nonHandicapList);
		Waypoints han = new Waypoints(handicapList);

		/**
		 * Waypoints objects initialized with empty lists. They are used to keep track
		 * of what buildings are removed so that the Add building CheckBox ListView can
		 * be populated.
		 */
		Waypoints nonKill = new Waypoints(emptyNonHandicapList);
		Waypoints hanKill = new Waypoints(emptyHandicapList);

		/**
		 * Display objects from the facade class which print helpful debug information
		 * from concrete classes that implement the same interface.
		 */
		Display view = new Display(handicapList.get(0));
		view.printPath();
		Display li = new Display(han);
		li.printList();

		/**
		 * Observable List containing buildings names. Observable lists are great with
		 * ListViews because they are contiguous if the Observable list is the
		 * implementation of the List View. If you remove an element from the Observable
		 * list, then that cell of the ListView will also be removed (I think).
		 */
		ObservableList<String> names = FXCollections.observableArrayList();
		names = populateChecks(handicapList);
		/**
		 * ListView that is populated by Observable List but is not managed by it.
		 */
		ListView<String> removeBuildings = new ListView<>(names);
		ListView<String> addBuildings = new ListView<>();
		/**
		 * List that manages ListView.
		 */
		List<String> iterRemove = new ArrayList<>();
		List<String> iterAdd = new ArrayList<>();
		/**
		 * Sets the ListView to a manageable size and sets invisible until Password
		 * field event handler fires.
		 */
		removeBuildings.setMaxWidth(250);
		removeBuildings.setMaxHeight(100);
		removeBuildings.setVisible(false);
		addBuildings.setMaxWidth(250);
		addBuildings.setMaxHeight(100);
		addBuildings.setVisible(false);

		// ACTIONS ------------------------------------

		/**
		 * Event handler for the ComboBox that dictates which list will be sent to
		 * server.
		 */
		toggle.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				/**
				 * Clears data.txt
				 */
				try (FileOutputStream writer = new FileOutputStream("data.txt");) {
					writer.write(("").getBytes());
					writer.close();
				} catch (IOException e) {
					System.out.println("error on delete to data.txt");
				}
				/**
				 * Depending on the selection: The respective list will be written locally and
				 * sent to server. The respective mode of transportation will be written locally
				 * and sent to server. The respective boolean selection will be written locally.
				 */
				try {
					if (toggle.getValue() == "Yes") {

						serverWriteToFile(han, true);
						localWriteToFile("true");

					} else if (toggle.getValue() == "No") {

						serverWriteToFile(non, false);
						localWriteToFile("false");
					}

				} catch (IOException e) {
					System.out.println(e);
				}
				/**
				 * Sets the Password field to be visible once the user has selected a list.
				 */
				pb.setVisible(true);
				label1.setVisible(true);

				/**
				 * Loads the webpage on the server with the WebEngine.
				 */
				engine.load("https://comsc.uco.edu/~jf024/directions.php");
			}
		});

		/**
		 * Event handler for the Pass word block.
		 */
		pb.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				/**
				 * If the password is incorrect, the message is set and color is changed to red.
				 */
				if (!pb.getText().equals("chad")) {
					message.setText("Your password is incorrect!");
					message.setTextFill(Color.rgb(210, 39, 30));

				}
				/**
				 * If the password is correct, the message is set and color is changed to green.
				 */
				else {
					message.setText("Your password is correct!");
					message.setTextFill(Color.rgb(21, 117, 84));
					/**
					 * Everything in admin panel including the ListVew and remove button are
					 * visible.
					 */
					removeBuildings.setVisible(true);
					remove.setVisible(true);
					remove.setText("Remove");
					addBuildings.setVisible(true);
					add.setVisible(true);
					add.setText("Add");
					hide.setVisible(true);
					hide.setText("Hide Admin Panel");

				}
				/**
				 * Field is cleared for security.
				 */
				pb.clear();
			}
		});

		/**
		 * Event handler for ListView where the user can remove buildings.
		 */
		removeBuildings.setCellFactory(CheckBoxListCell.forListView(new Callback<String, ObservableValue<Boolean>>() {
			@Override
			public ObservableValue<Boolean> call(String item) {
				BooleanProperty observable = new SimpleBooleanProperty();
				observable.addListener((obs, wasSelected, isNowSelected) -> {
					/**
					 * If the user checks a box, then that selection is added to iterRemove.
					 */
					if (isNowSelected) {
						iterRemove.add(item);
					} else {
						iterRemove.remove(item);
					}
				});
				return observable;
			}
		}));
		/**
		 * Event handler for ListView where the user can add buildings.
		 */
		addBuildings.setCellFactory(CheckBoxListCell.forListView(new Callback<String, ObservableValue<Boolean>>() {
			@Override
			public ObservableValue<Boolean> call(String item) {
				BooleanProperty observable = new SimpleBooleanProperty();
				observable.addListener((obs, wasSelected, isNowSelected) -> {
					/**
					 * If the user checks a box, then that selection is added to iterRemove.
					 */
					if (isNowSelected) {
						iterAdd.add(item);
					} else {
						iterAdd.remove(item);
					}
				});
				return observable;
			}
		}));

		/**
		 * Event handler for the remove button that removes the buildings selected by
		 * the user.
		 */
		remove.setOnAction(e -> {

			for (int i = 0; i < iterRemove.size(); i++) {

				/**
				 * Adds the removed buildings to a Waypoints object so that they can be added
				 * back with Add ListView at the admin's wishes.
				 */
				hanKill.addBuilding(han.find(iterRemove.get(i)));
				nonKill.addBuilding(non.find(iterRemove.get(i)));
				/**
				 * Removes selected buildings from Waypoints object so that the remaining can be
				 * written to the server.
				 */
				han.removeBuilding(/* iterRemove.get(i), */han.find(iterRemove.get(i)));
				non.removeBuilding(/* iterRemove.get(i), */ non.find(iterRemove.get(i)));
				/**
				 * Removes selected buildings from the ListVew.
				 */
				removeBuildings.getItems().remove(iterRemove.get(i));

				/**
				 * Similarly, we need to remove the Buildings off of the listView before we
				 * adjust the queue
				 */
				addBuildings.getItems().add(iterRemove.get(i));
				/**
				 * Removes all elements in the list. If we dont have this statement, then all
				 * selected items would be removed as per statements above, but it would cause
				 * an out of bounds error since there would be things in the list that are not
				 * in the Waypoints objects.
				 */
				iterRemove.remove(i);
				/**
				 * The problem with the statement above is that it removes one item at a time.
				 * By firing the button if multiple things are selected, it guarantees that
				 * every selected item is removed.
				 */
				if (iterRemove.size() > 0)
					remove.fire();
			}

			/**
			 * Depending on the value read from bool.txt and parsed into a bool, this
			 * dictates which list is written back to server to save selections.
			 */
			try {
				boolean bool = readBool();
				if (bool)
					serverWriteToFile(han, true);
				else
					serverWriteToFile(non, false);
				/**
				 * Webpage is loaded again to show changes.
				 */
				engine.load("https://comsc.uco.edu/~jf024/directions.php");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		/**
		 * Event handler for the add button that adds the buildings selected by the
		 * user.
		 */
		add.setOnAction(e -> {

			for (int i = 0; i < iterAdd.size(); i++) {

				/**
				 * Adds buildings from add ListView to remove ListView. No change in logic as
				 * from remove.
				 */
				han.addBuilding(hanKill.find(iterAdd.get(i)));
				non.addBuilding(nonKill.find(iterAdd.get(i)));
				/**
				 * This removes the buildings from the add ListView.
				 */
				hanKill.removeBuilding(/* iterAdd.get(i), */hanKill.find(iterAdd.get(i)));
				nonKill.removeBuilding(/* iterAdd.get(i), */nonKill.find(iterAdd.get(i)));
				/**
				 * Removes selected buildings from the ListVew.
				 */
				addBuildings.getItems().remove(iterAdd.get(i));

				/**
				 * Takes selected buildings and adds them to the list that is to be sent to the
				 * server.
				 */
				removeBuildings.getItems().add(iterAdd.get(i));
				/**
				 * This updates the queue, by purging the list.
				 */
				iterAdd.remove(i);
				/**
				 * This fires add to complete a full data transfer. Same logic as prior.
				 */
				if (iterAdd.size() > 0)
					add.fire();
			}

			/**
			 * Depending on the value read from bool.txt and parsed into a bool, this
			 * dictates which list is written back to server to save selections.
			 */
			try {
				boolean bool = readBool();
				if (bool)
					serverWriteToFile(han, true);
				else
					serverWriteToFile(non, false);
				/**
				 * Webpage is loaded again to show changes.
				 */
				engine.load("https://comsc.uco.edu/~jf024/directions.php");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		/**
		 * Event handler for the hide button that hides admin panel and resets password
		 * message.
		 */
		hide.setOnAction(e -> {

			removeBuildings.setVisible(false);
			remove.setVisible(false);
			addBuildings.setVisible(false);
			add.setVisible(false);
			message.setText("");
			hide.setVisible(false);

		});

		/**
		 * Opens a link from the user's default browser to view the Demo Video
		 */
		link.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=HSx1qsknLpU").toURI());
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});

		// VIEW ------------------------------------

		/**
		 * I honestly have no clue what this does...
		 */
		engine.setUserAgent(
				"Mozilla/5.0 (Linux; U; Android 2.2.1; en-us; Nexus One Build/FRG83) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");

		/**
		 * By using this toolkit from AWT, it allows us to set the scene size relative
		 * to the user's screen dimension. Otherwise, functionality would be cut off.
		 */
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		double percent = 0.80;
		double width = screenSize.getWidth() * percent;
		double height = screenSize.getHeight() * percent;
		Scene sceneMap = new Scene(new Group(), width, height);
		GridPane grid = new GridPane();
		VBox map = new VBox();
		VBox checks = new VBox();
		VBox passVBox = new VBox();
		VBox removeBox = new VBox();
		VBox addBox = new VBox();
		HBox toggleBox = new HBox();
		HBox passHBox = new HBox();

		/**
		 * Glue all GUI components together.
		 */
		map.getChildren().addAll(myWebView);
		passHBox.getChildren().addAll(label1, pb);
		toggleBox.getChildren().addAll(label2, toggle);
		passVBox.getChildren().addAll(passHBox, message);
		removeBox.getChildren().addAll(removeBuildings, remove);
		addBox.getChildren().addAll(addBuildings, add);
		checks.getChildren().addAll(link, toggleBox, passVBox, removeBox, addBox, hide);

		/**
		 * Setting height and width of components
		 */
		pb.setMaxWidth(100);
		map.prefWidthProperty().bind(stage.widthProperty().multiply(percent));
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));
		checks.setPadding(new Insets(10, 10, 10, 10));
		checks.setSpacing(20);

		grid.add(map, 0, 0);
		grid.add(checks, 1, 0);

		grid.getColumnConstraints().add(new ColumnConstraints(width - (250 + 10)));
		grid.getColumnConstraints().add(new ColumnConstraints(250));
		grid.getRowConstraints().add(new RowConstraints(height));

		Group root = (Group) sceneMap.getRoot();
		root.getChildren().add(grid);
		stage.setScene(sceneMap);

		/**
		 * Let the show begin!
		 */
		stage.show();
	}

}