package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Square square = new Square(4);
        Square secondSquare = new Square(8);
        System.out.println("Hello yopta");
        System.out.println("Площадь квадрата со стороной " + square.l + " = " + square.area());
        System.out.println("Площадь квадрата со стороной " + secondSquare.l + " = " + secondSquare.area());
    }

}
