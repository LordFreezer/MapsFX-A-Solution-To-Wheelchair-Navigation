package application;

/**
 * Facade class that lets the dev to debug through print statements through the
 * interface.
 */
public class Display {

	private Print user;
	private Print path;
	private Print list;

	/**
	 * Constructors for each concrete object used.
	 */
	public Display(Waypoints w) {
		list = w;
	}

	public Display(Waypoint p) {

		path = p;
	}

	public Display(User u) {
		user = u;
	}

	/**
	 * Individual print functions for facade object to call.
	 */
	public void printUserInfo() {
		user.print();
	}

	public void printPath() {
		path.print();
	}

	public void printList() {
		list.print();
	}

}
