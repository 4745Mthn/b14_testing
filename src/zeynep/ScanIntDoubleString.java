package zeynep;

import java.util.Scanner;

public class ScanIntDoubleString {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Declare second int");
        int y = scan.nextInt();

        System.out.println("Declare second double");
        double e = scan.nextDouble();

        System.out.println("Declare second String");
        String str = scan.next();

        scan.close();

        System.out.println("Sum of ints: " + (i + y));
        System.out.println("Sum of doubles: " + (d + e));
        System.out.println(s + str);



            /* Declare second integer, double, and String variables. */

            /* Read and save an integer, double, and String to your variables.*/
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

            /* Print the sum of both integer variables on a new line. */

            /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

            scan.close();
    }
}
