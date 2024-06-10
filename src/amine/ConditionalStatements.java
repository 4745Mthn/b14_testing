package amine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//task obtained from hackerrank.com
/*
Given an integer,n perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird

1<= n <=100

Sample Input0:
3
Sample Output0:
Weird

Sample Input1:
24
Sample Output1:
Not Weird

 */
public class ConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        if (n % 2 == 0) {
            if (n >= 2 && n < 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }


        bufferedReader.close();
    }
}

