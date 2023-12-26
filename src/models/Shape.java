package models;
import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> pointsArrayList;

    // Constructor to initialize the Shape with an empty ArrayList of points
    public Shape(){
        pointsArrayList = new ArrayList<Point>();
    }

    // Method to add a Point to the ArrayList of points
    public void addPoint(Point point) {
        pointsArrayList.add(point);
    }


    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;
        // Creating variable size that holds the number of points in array list
        int size = pointsArrayList.size();
        // Iterating through the first 10 points to calculate the sum of distances between consecutive points
        for (int i = 0; i < size-1; i++) {
            perimeter += pointsArrayList.get(i).distanceTo(pointsArrayList.get(i + 1));
        }

        // Adding the distance between the last and first points to complete the perimeter calculation
        perimeter += pointsArrayList.getFirst().distanceTo(pointsArrayList.get(size-1));

        return perimeter;
    }

    // Method to find the longest distance between consecutive points
    public double getLongest() {
        double maxLength = 0;
        double side;
        // Creating variable size that holds the number of points in array list
        int size = pointsArrayList.size();


        // Iterating through the first 10 points to find the longest distance
        for (int i = 0; i < size - 1; i++) {
            side = pointsArrayList.get(i).distanceTo(pointsArrayList.get(i + 1));
            if (maxLength < side) {
                maxLength = side;
            }
        }

        // Checking the distance between the last and first points
        side = pointsArrayList.getFirst().distanceTo(pointsArrayList.get(size - 1));
        if (maxLength < side) {
            maxLength = side;
        }

        return maxLength;
    }

    // Method to calculate the average distance between consecutive points
    public double getAverage() {
        return calculatePerimeter() / 10;
    }
}