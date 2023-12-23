import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class myApplication {
    public static void main(String[] args) throws FileNotFoundException {
        // Initializing a File object for the input file
        File file = new File("C:\\Users\\Ернар\\IdeaProjects\\AssignmentOne\\src\\source.txt");

        // Creating a Scanner to read from the input file
        Scanner sc = new Scanner(file);

        // Creating a Shape object to store points and perform calculations
        Shape shape = new Shape();

        // Reading coordinates from the file until there are no more tokens
        while (sc.hasNext()) {
            // Reading x and y coordinates from the file
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            // Creating a Point object with the read coordinates
            Point point = new Point(x, y);

            // Adding the Point object to the Shape
            shape.addPoint(point);
        }

        // Printing the calculated perimeter of the shape
        System.out.println("Perimeter: " + shape.calculatePerimeter());

        // Printing the Point with the longest distance from the origin
        System.out.println("Longest Side: " + shape.getLongest());

        // Printing the average distance of all points from the origin
        System.out.println("Average Side Length: " + shape.getAverage());
    }
}