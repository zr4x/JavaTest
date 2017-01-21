package ru.napoleon.sandbox;

/**
 * Created by Nik on 21.01.2017.
 */


public class Point {

    double x1;
    double x2;
    double y1;
    double y2;


    public static void main(String[] args) {
        Point point = new Point(1,2,3,7);
        System.out.println("Расстояние до точки  = " + point.distance());

    }

    public Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    } 
}
