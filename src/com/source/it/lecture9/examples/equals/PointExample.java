package com.source.it.lecture9.examples.equals;

import java.awt.*;

public class PointExample {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 1);
        Point point3 = new Point(0, 1);
        /*System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point1));
        System.out.println(point1.equals(point1));

        System.out.println(point3.equals(point1));*/

        ColorPoint colorPoint1 = new ColorPoint(1, 1, Color.BLACK);
        ColorPoint colorPoint2 = new ColorPoint(1, 1, Color.BLACK);
        System.out.println(colorPoint1.equals(point2));
        System.out.println(point2.equals(colorPoint1));
    }
}
