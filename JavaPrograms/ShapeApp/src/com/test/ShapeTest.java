package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.beans.Circle;
import com.beans.Rectangle;
import com.beans.Shape;
import com.beans.Triangle;
import com.service.ShapeService;

public class ShapeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Choose a shape to create:");
            System.out.println("1: Triangle");
            System.out.println("2: Circle");
            System.out.println("3: Rectangle");
            System.out.print("Your choice: ");

            try {
                choice = sc.nextInt();
                
                if (choice < 1 || choice > 3) {
                    System.out.println("Invalid choice. Please select between 1 and 3.");
                    i--; 
                    continue;
                }
                
                ShapeService.acceptData(choice);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
                i--; // Decrement counter to allow re-entry
            }
        }

        System.out.println("\nCalculating details for all shapes:");
        for (int i = 0; i < ShapeService.getAllShapes().length; i++) {
            ShapeService.calculatedetails(i);
        }

        // Count shapes
        int cntTriangle = 0;
        int cntCircle = 0;
        int cntRectangle = 0;

        Shape[] sarr = ShapeService.getAllShapes();

        for (Shape shape : sarr) {
            if (shape instanceof Triangle) {
                cntTriangle++;
            } else if (shape instanceof Circle) {
                cntCircle++;
            } else if (shape instanceof Rectangle) {
                cntRectangle++;
            }
        }
        System.out.println("Triangle Count: " + cntTriangle);
        System.out.println("Circle Count: " + cntCircle);
        System.out.println("Rectangle Count: " + cntRectangle);

        sc.close(); 
    }
}
