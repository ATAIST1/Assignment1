package models;

// Class representing a point in a two-dimensional space
public class Point {
    // Private fields to store the x and y coordinates of the point
    private double x;
    private double y;

    // Method to calculate the distance between this point and another point
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    // Constructor to initialize the point with given x and y coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Override of the toString() method to provide a string representation of the Point
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}