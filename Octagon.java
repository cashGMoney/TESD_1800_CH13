
public class Octagon extends GeometricObject 

// Implements the Comparable and Cloneable interfaces
implements Comparable<Octagon>, Cloneable {

    // Variable
    private double allSide;

    // Formula for Area of an Octagon
    public double getArea() {
        return (2+(4/Math.sqrt(2))) * allSide * allSide;
    }

    // A constructor that creates an Octogon with all equal sides.
    public Octagon(double allSide) {
        this.allSide = allSide;
	}

    // Create compareTo method
    public int compareTo(Octagon o) {
        if(getArea() == o.getArea()) return 0;

        else return 1;
    }

    // Implement clone method (page 519)
    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
