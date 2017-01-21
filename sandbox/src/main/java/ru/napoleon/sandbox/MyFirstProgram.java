package ru.napoleon.sandbox;

import javax.xml.bind.SchemaOutputResolver;
import java.util.concurrent.RecursiveAction;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Hello vasya!");

        Rectangle r = new Rectangle(5, 6);
        System.out.println("Площадь квадрата со стороной " + r.a + " and " + r.b + " = " + r.area());

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Point x = new Point(1,3);
        Point y = new Point(3, 7);
        System.out.println("Расстояние от точки "+ x.p1 +" до " + y.p2 + " = " + Math.sqrt(x.distance() + y.distance()));
    }

    public static void hello(String a) {
        System.out.println(a);

    }
}