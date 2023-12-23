package models;

public class Point {
    private double x;
    private double y;

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
    }

    public Point(double x, double  y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
