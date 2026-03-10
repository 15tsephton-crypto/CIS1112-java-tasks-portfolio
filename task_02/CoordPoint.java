package task_02;
import static java.lang.Math.sqrt; // imports the sqrt method from the math class
import static java.lang.Math.pow; // imports the pow method from the math class
public class CoordPoint { // crates class CoordPoint
	private double x = 0; // initialises x coordinate
	private double y = 0; // initialises y coordinate
	public CoordPoint(double nx, double ny) { // class constructor
		this.x = nx;
		this.y = ny;
	}
	public CoordPoint(CoordPoint p) { // sets x and y coordinates using another CoordPoint object
		this.x = p.x;
		this.y = p.y;
	}
	public void setLocation(double nx, double ny) { // sets the x and y coordinates using two values
		this.x = nx;
		this.y = ny;
	}
	public float getDistance(double nx, double ny) { // returns the distance between two Euclidean coordinates
		float distance = (float) sqrt(pow((this.x-nx), 2)+pow((this.y-ny), 2));
		return distance;
	}
	public double getX() { // gets the x coordinate of the animal
		return this.x;
	}
	public double getY() { // gets the y coordinate of the animal
		return this.y;
	}
}