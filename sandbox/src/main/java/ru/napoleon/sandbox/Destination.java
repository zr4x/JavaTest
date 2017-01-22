package ru.napoleon.sandbox;

/**
 * Created by Nik on 22.01.2017.
 */

public class Destination {
    public static void main(String args[]) {
        Point p1 = new Point(1, 1); //created first point
        Point p2 = new Point(3, 5); //created second

        System.out.println("Расстояние между точкой с координатами: " + "("+ p1.x + ", " + p1.y+")" + " и точкой с координатами " + "("+p2.x + ", " + p2.y+")" + " равняется " + destination(p1, p2));

        System.out.println("Расстояние между точкой с координатами: " + "(" + p1.x + ", " + p1.y+")" + " и точкой с координатами " + "("+p2.x + ", " + p2.y+")" + " равняется " + p1.destination(p2));

    }

    public static double destination(Point p1, Point p2) {
        return Math.sqrt((Math.pow((p2.x - p1.x), 2)) + (Math.pow((p2.y - p1.y), 2)));
    }
}
