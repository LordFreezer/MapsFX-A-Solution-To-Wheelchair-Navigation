package application;

public class Coordinate<Latitude, Longitude> {

	/**
	 * All Coodinates objects are is a 2 ordered pair of latitude and longitude
	 * components
	 */
	private Latitude lat;
	private Longitude lon;
	private Coordinate startPoint;
	private Coordinate endPoint;

	/**
	 * Getters
	 */
	public Latitude getLat() {
		return lat;
	}

	public Longitude getLong() {
		return lon;
	}

	/**
	 * Setters
	 */
	public void setLat(Latitude lat) {
		this.lat = lat;
	}

	public void setLong(Longitude lon) {
		this.lon = lon;
	}

	/**
	 * Constructor
	 */
	public Coordinate(Latitude lat, Longitude lon) {

		this.lat = lat;
		this.lon = lon;
	}

}
