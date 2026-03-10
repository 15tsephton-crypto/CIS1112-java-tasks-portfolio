package task_04;
public class TriangleSolver {
	public boolean areEqual(float a,float b) { // compares two floats a and b to see if they are equal
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
	public String solveTriangle(Triangle t) { // determines if a triangle is equilateral, isosceles or scalene
		if (areEqual(t.getA(), t.getB()) && areEqual(t.getA(), t.getC())) {
			return "Equilateral";
		} else if (areEqual(t.getA(), t.getB()) || areEqual(t.getA(), t.getC()) || areEqual(t.getB(), t.getC())) {
			return "Isosceles";
		} else {
			return "Scalene";
		}
	}
}