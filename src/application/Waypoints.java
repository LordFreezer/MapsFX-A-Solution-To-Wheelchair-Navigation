package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete class that creates a list of nodes. Also contains operations for the
 * objects created.
 */
public class Waypoints implements Print {

	/**
	 * Attributes for Waypoint. Inheritance allows for Waypoints to use Waypoint
	 * operations
	 */
	private String name;
	private Coordinate startPoint;

	private List<Waypoint> buildingList = new ArrayList<Waypoint>();

	/**
	 * Kills a Waypoint from the Waypoints object
	 */
	public void removeBuilding(/* String name, */ Waypoint w) {
		// if (name == w.getName())
		buildingList.remove(w);
	}

	/**
	 * Adds a Waypoint to the Waypoints object
	 */
	public void addBuilding(Waypoint w) {

		buildingList.add(w);
	}

	/**
	 * Gives the size for the Waypoints object
	 */
	public int size() {
		return buildingList.size();
	}

	/**
	 * Allows access to a Waypoint at a specific index
	 */
	public Waypoint get(int i) {
		return buildingList.get(i);
	}

	/**
	 * Searches for a Waypoint from Waypoints
	 */
	public Waypoint find(String name) {
		for (int i = 0; i < buildingList.size(); i++) {
			if (buildingList.get(i).getName() == name)
				return buildingList.get(i);
		}
		return null;

	}

	/**
	 * Function that implements interface Print
	 */
	@Override
	public void print() {
		System.out.println("FACADE/");
		for (int i = 0; i < buildingList.size(); i++)
			System.out.println("WAYPOINT(S)" + buildingList.get(i).getStart().getLat() + ","
					+ buildingList.get(i).getStart().getLong() + "/FACADE END");
		System.out.println("/FACADE END");
	}

	/**
	 * Polymorphic constructors for Waypoints objects and single Waypoint
	 * respectivly
	 */
	public Waypoints(List<Waypoint> buildingList) {

		this.buildingList = buildingList;
	}

	public Waypoints(String name, Coordinate startPoint) {

		this.name = name;
		this.startPoint = startPoint;
	}

}
