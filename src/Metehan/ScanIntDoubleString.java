package Metehan;

import java.util.Scanner;

public class ScanIntDoubleString {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Metehan ";

        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        String str = scan.nextLine();

        System.out.println( i + num1);
        System.out.println( d + num2);
        System.out.println( s + str);

        scan.close();

    }
}



/* Declare second integer, double, and String variables. */

/* Read and save an integer, double, and String to your variables.*/
// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

/* Print the sum of both integer variables on a new line. */

/* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */


