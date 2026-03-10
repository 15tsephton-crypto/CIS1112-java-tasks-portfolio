/**
 *
 * This is the CIS1112 Coursework 1.4 assignment helper file.
 *
 *
 * File name: CW1_4.java
 * Package: default
 * Created:	January 9th, 2020
 * @Author:	Dr. Robert Lyon
 * 
 */

/**
 * This is the coursework helper file. Do not,
 * 
 * i) rename the file.
 * ii) edit the file.
 * 
 *
 */
package task_04;
public class CW1_4 
{
	/**
	 * Main entry point to the application.
	 * 
	 * @param args unused command line arguments.
	 */
	public static void main(String[] args) 
	{	    
		Triangle t = new Triangle(1f,1f,1f);
		
		TriangleSolver solver = new TriangleSolver();
		
		String triType = solver.solveTriangle(t);
		
		print("Triangle Type: " + triType);
		
		
		t = new Triangle(1f,1f,2f);		
		
		triType = solver.solveTriangle(t);
		
		print("Triangle Type: " + triType);
		
		
		t = new Triangle(1f,2f,3f);		
		
		triType = solver.solveTriangle(t);
		
		print("Triangle Type: " + triType);
			
	}
	
	/**
	 * I've wrapped the print method, to make my examples clearer.
	 * 
	 * @param text the text to print to standard output.
	 */
	private static void print(String text)
	{
		System.out.println(text);
	}
}