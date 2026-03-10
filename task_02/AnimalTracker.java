package task_02;
public class AnimalTracker { // creates class AnimalTracker
	public String name = ""; // initialises name as an empty string
	public CoordPoint location; // declares location as a CoordPoint object
	private double distanceTravelled = 0; // initialises distanceTravelled as a double with an initial value of 0
	public AnimalTracker(String name, double nx, double ny) { // class constructor
		this.name = name;
		location = new CoordPoint(nx, ny); // initialises location as a CoordPoint object
	}
	public void move(double nx, double ny) { // sets a new location for the animal and adds the distance traversed to the distanceTravelled attribute
		float d = location.getDistance(nx, ny);
		location.setLocation(nx, ny);
		this.distanceTravelled += d;
	}
	public double getDistanceTravelled() { // returns the distance travelled by the animal
		return this.distanceTravelled;
	}
}