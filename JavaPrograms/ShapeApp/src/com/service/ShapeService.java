package com.service;

import java.util.Scanner;
import com.beans.Circle;
import com.beans.Rectangle;
import com.beans.Shape;
import com.beans.Triangle;

public class ShapeService {
    static Shape[] sarr;
    static int cnt;

    static {
        sarr = new Shape[5];
        cnt = 0;
    }

    public static void acceptData(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color:");
        String color = sc.next();
        
        switch (choice) {
            case 1:
                System.out.println("Enter the base of the Triangle:");
                float b = sc.nextFloat();
                System.out.println("Enter the height of the Triangle:");
                float h = sc.nextFloat();
                System.out.println("Enter the side1 of the Triangle:");
                float s1 = sc.nextFloat();
                System.out.println("Enter the side2 of the Triangle:");
                float s2 = sc.nextFloat();
                sarr[cnt] = new Triangle(color, b, h, s1, s2);
                break;
                
            case 2:
                System.out.println("Enter the radius of the Circle:");
                float r = sc.nextFloat();
                sarr[cnt] = new Circle(color, r);
                break;
                
            case 3:
                System.out.println("Enter the length of the Rectangle:");
                float l = sc.nextFloat();
                System.out.println("Enter the breadth of the Rectangle:");
                float br = sc.nextFloat();
                sarr[cnt] = new Rectangle(color, l, br);
                break;
        }
        cnt++;
    }

    public static void calculatedetails(int pos) {
        if (sarr[pos] != null) {
            System.out.println(pos + ": Area: " + sarr[pos].calcArea());
            System.out.println(pos + ": Perimeter: " + sarr[pos].calcPerimeter());
        } else {
            System.out.println("Shape at position " + pos + " is null.");
        }
    }

    public static Shape[] getAllShapes() {
        return sarr;
    }
}
