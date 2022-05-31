package com.absoft.unit3;

import com.absoft.unit3.robots.BalletDancingRobot;
import com.absoft.unit3.robots.DancingRobot;
import com.absoft.unit3.robots.FolkDancingRobot;
import com.absoft.unit3.robots.JazzDancingRobot;
import com.absoft.unit3.shapes.Circle;
import com.absoft.unit3.shapes.Rectangle;
import com.absoft.unit3.shapes.Shape;
import com.absoft.unit3.shapes.Square;

public class Main {
    public static void main(String[] args) {
        DancingRobot robot = new BalletDancingRobot();

//        printRobot(robot);
//        printRobot(new FolkDancingRobot());
//        printRobot(new JazzDancingRobot());
        showShapes();
    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("=================");
        System.out.println("Dance Type 1: " + robot.getDanceType1());
        System.out.println("Dance Type 1: " + robot.getDanceType2());
        System.out.println("Default Dance Type: " + robot.getDefaultDanceType());
        System.out.println("=================\n");
    }

    private static void showShapes() {
        Shape shape1 = new Rectangle(2, 3);
        Shape shape2 = new Rectangle(4, 5);

        System.out.println(shape1.getSquare());
        System.out.println(shape2.getSquare());


        shape1 = new Circle(10);
        System.out.println(shape1.getSquare());

        Circle shape3 = new Circle(9);
        System.out.println(shape3.getSquare());
        System.out.println(shape3.getRadius());

        System.out.println("=====");
        Circle shape4 = new Circle(5);
        System.out.println(shape4.getRadius());
        System.out.println(shape3.getRadius() + " bbb");
        shape4.setRadius(1);
        System.out.println(shape4.getRadius());
        System.out.println(shape3.getRadius());

        System.out.println("example");
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        System.out.println(circle1.getRadius());

        System.out.println("=====!");
        Rectangle variable = new Rectangle(3, 2);
        System.out.println(variable.getSquare());

        variable = new Square(3);
        System.out.println(variable.getSquare());

        var square = new Square (10);
        System.out.println(square.getSide());
    }
}
