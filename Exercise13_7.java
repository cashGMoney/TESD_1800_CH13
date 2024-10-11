public class Exercise13_7 {
  public static void main(String[] args) {

    // Create an array of five GeometricObjects (Triangles)
    Triangle[] triangles = new Triangle[5];
    triangles[0] = new Triangle(2, 3, 4, "blue", true);
    triangles[1] = new Triangle(3, 3, 3, "green", false);
    triangles[2] = new Triangle(6, 3, 8, "purple", true);
    triangles[3] = new Triangle(3, 3, 3, "white", false);
    triangles[4] = new Triangle(3, 3, 3, "magenta", true);

    // Loop through the array and display triangle properties
    for (int i = 0; i < triangles.length; i++) {

      // For each object in the array, display its area
      System.out.println("\nTraingle " + i + ": The area is " + triangles[i].getArea());

      // Invoke its howToColor method if it is colorable.
      if (triangles[i].isFilled()) {
        System.out.println("The color is " + triangles[i].getColor() + " and " + triangles[i].howToColor());
      } else {
        System.out.println("The triangle is not colored.");
      }
    }
  }
}

/* --------------  Unused code  ------------------

      // System.out.println("\nA " + triangles[i].toString());
      // 
*/