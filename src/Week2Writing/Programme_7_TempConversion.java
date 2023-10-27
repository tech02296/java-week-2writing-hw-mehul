package Week2Writing;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value in fahreneit");
        Float temp = scanner.nextFloat();
        //obj creation for  non static method

        Programme_7_TempConversion obj = new Programme_7_TempConversion();
        obj.convertTempToDegreeCelsius(temp);
        scanner.close();


    }
    //Temperature conversion method(non static)
    public void convertTempToDegreeCelsius(Float temp){
        float c = ((temp - 32 * 5/9));
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c +" degree celsis");
    }





}
