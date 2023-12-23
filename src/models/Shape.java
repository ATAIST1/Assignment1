package models;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> pointsArrayList;
    public Shape(){
        pointsArrayList = new ArrayList<Point>();
    }
    public void addPoint(Point point) {
        pointsArrayList.add(point);
    }
    public double calculatePerimeter() {
        double per = 0;
        for(int i = 0; i < 9; i++) {
            per += pointsArrayList.get(i).distanceTo(pointsArrayList.get(i+1));
        }
        per += pointsArrayList.get(0).distanceTo(pointsArrayList.get(9));
        return per;
    }

    public double getLongest() {
        double max = 0;
        double side;
        for(int i = 0; i < 9; i++) {
            side = pointsArrayList.get(i).distanceTo(pointsArrayList.get(i+1));
            if(max < side) {max = side;}
        }
        side = pointsArrayList.get(0).distanceTo(pointsArrayList.get(9));
        if(max < side) {max = side;}
        return max;
    }
    public double getAverage() {
        double min = 999999999;
        double sum = 0;
        for(int i = 0; i < 9; i++) {
            sum += pointsArrayList.get(i).distanceTo(pointsArrayList.get(i + 1));
        }
        return sum / 10;
    }




}