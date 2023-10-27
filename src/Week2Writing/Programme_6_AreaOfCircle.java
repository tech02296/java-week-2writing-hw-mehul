package Week2Writing;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */

public class Programme_6_AreaOfCircle {
    // Calculating the area of the circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi *radius *radius);
        System.out.println("The area of the circle is : " + area);
    }

    public static void main(String[] args) {
        //Scanner declaring for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
            //Closing the scanner
        scanner.close();
        }
    }

