package great_team;

import java.util.Scanner;


public class ScanIntDoubleString {
    /* Declare second integer, double, and String variables. */
    /* Read and save an integer, double, and String to your variables.*/

    /* Print the sum of both integer variables on a new line. */

    /* Print the sum of the double variables on a new line. */

    /* Concatenate and print the String variables on a new line;
        	the 's' variable should be printed first. */

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "GreatTeam ";
        Scanner scan = new Scanner(System.in);

        int i2;
        double d2;
        String s2;

        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        //nextline to catch the enter key pressed after the second number
        scan.nextLine();
        s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();
    }
}