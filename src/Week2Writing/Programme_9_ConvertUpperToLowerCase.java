package Week2Writing;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */


public class Programme_9_ConvertUpperToLowerCase {
    //Scanner declaration for reading input form console
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string: ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new  Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();



    }
//Conversion of Uppercase to lower case method
    public  void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }


}
