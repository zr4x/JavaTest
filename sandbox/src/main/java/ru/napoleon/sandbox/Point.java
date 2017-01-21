package ru.napoleon.sandbox;

/**
 * Created by Nik on 21.01.2017.
 */


public class Point {

    double p1;
    double p2;

    public static void main(String[] args) {
        Point x = new Point(1, 3);
        Point y = new Point(3, 7);
        System.out.println("Расстояние от точки " + x.p1 + " до " + y.p2 + " = " + Math.sqrt(x.distance() + y.distance()));

    }

    public Point(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double distance() {
        return Math.pow(this.p2 - this.p1, 2);
    }
}
