// (The Triangle class) Design a class named Triangle that extends GeometricObject.
public class Triangle extends GeometricObject {

    // Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    // A no-arg constructor that creates a default triangle.
    Triangle() {
    }

    // A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(double side1, double side2, double side3) {
	    this.side1 = side1;
	    this.side2 = side2;
        this.side3 = side3;
	}

    // The accessor methods for all three data fields.
    /** Return side1 */
    public double getSide1() {
        return side1;
    }

    /** Set side1 */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /** Return side2 */
    public double getSide2() {
        return side2;
    }

    /** Set side2 */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /** Return side3 */
    public double getSide3() {
        return side3;
    }

    /** Set side3 */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // A method named getArea() that returns the area of this triangle.
    public double getArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // A method named getPerimeter() that returns the perimeter of this triangle.
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // A method named toString() that returns a string description for the triangle.
    // Changed the output, I didn't like the format.
    @Override
    public String toString() {
        return "Triangle:";
    }
}

/* ---  Replaced code ----

    @Override
    public String toString() {
        return "Triangle: \n side1 = " + side1 + "\n side2 = " + side2 + "\n side3 = " + side3;
    }

 */