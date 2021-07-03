package application;

/**
 * Concrete class that creates single nodes that contain a name and coordinate
 */
public class Waypoint extends Waypoints implements Print {

	private String name;
	private Coordinate startPoint;

	/**
	 * Function that implements interface Print
	 */
	@Override
	public void print() {

		System.out.println(
				"FACADE/name " + name + " coord " + startPoint.getLat() + "," + startPoint.getLong() + "/FACADE END");
	}

	/**
	 * Getters
	 */
	public String getName() {
		return name;
	}

	public Coordinate getStart() {
		return startPoint;
	}

	/**
	 * Constructor
	 */
	public Waypoint(String name, Coordinate startPoint) {
		super(name, startPoint);
		this.name = name;
		this.startPoint = startPoint;
	}

}