package task_04;
public class Triangle {
	private float a = 0; // initialises attribute a as an float with value 0
	private float b = 0; // initialises attribute b as an float with value 0
	private float c = 0; // initialises attribute c as an float with value 0
	public Triangle(float sa, float sb, float sc) { // constructor for the Triangle class
		this.a = sa;
		this.b = sb;
		this.c = sc;
	}
	public float getA() { // returns the value of attribute a
		return this.a;
	}
	public void setA(float sa) { // sets the value of attribute a to the value stored in sa
		this.a = sa;
	}
	public float getB() { // returns the value of attribute b
		return this.b;
	}
	public void setB(float sb) { // sets the value of attribute b to the value stored in sb
		this.b = sb;
	}
	public float getC() { // returns the value of attribute c
		return this.c;
	}
	public void setC(float sc) { // sets the value of attribute c to the value stored in sc
		this.c = sc;
	}
}