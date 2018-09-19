// justinrudolph01
/*
 * Justin Rudolph
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
private String str;
public Homework2(String str){
	this.str = str;

}

	/* Write the method uppercase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
public String uppercase() {
return str.toUpperCase();
}

	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */
public String strip(String str) {

	str = str.replace(".","");
	str = str.replace(",","");
	str = str.replace(" ","");
	str = str.replace("!","");

	return str;

}

	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle();
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle();
		r3.translate(100000, 100000);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
	return (rect.getWidth() * 2 + rect.getHeight() * 2);
	}

}
