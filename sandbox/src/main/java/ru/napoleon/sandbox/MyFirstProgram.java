package ru.napoleon.sandbox;


public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Hello vasya!");

        Rectangle r = new Rectangle(5, 6);
        System.out.println("Площадь квадрата со стороной " + r.a + " and " + r.b + " = " + r.area());

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    }

    public static void hello(String a) {
        System.out.println(a);

    }
}