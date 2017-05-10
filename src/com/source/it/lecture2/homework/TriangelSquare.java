package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        float length = 0;
        float square = 0;

        /*your code here*/
        double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        double length_tmp =  (side1 + side2 + side3);
        length = (float) length_tmp;

        double half_perimeter = length_tmp / 2;
        square = (float) Math.sqrt(half_perimeter * (half_perimeter - side1) * (half_perimeter - side2) * (half_perimeter - side3));

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
