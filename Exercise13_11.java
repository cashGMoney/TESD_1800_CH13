
public class Exercise13_11 {
  public static void main(String[] args) {

    // Write a test program that creates an Octagon object. 
    Octagon octagon1 = new Octagon(3);

    // Clone the first octagon into a second
    Octagon octagon2 = (Octagon) octagon1.clone();

    // Then use the .compareTo method to compare the two objects.
    int comparison = octagon1.compareTo(octagon2);

    // Display
    if (comparison == 0) {
      System.err.println("Equal");
    }
    else {
      System.err.println("Not Equal");
    }
  }
}
