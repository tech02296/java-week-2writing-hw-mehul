package Week2Writing;
/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number");
        double y = scanner.nextDouble();
        System.out.println("Enter the thired number");
        double z = scanner.nextDouble();
        averageOfThreeNumber(x,y,z);
        scanner.close();
    }


    //Calculate the average of the three numbers
    public static void averageOfThreeNumber(double a, double b, double c) {
        double average = ( a+b+c)/3;
        System.out.println("The average of" + a + ", " + b + " , " + c +" is : "  + average);


    }
}