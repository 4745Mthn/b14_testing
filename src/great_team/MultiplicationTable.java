package great_team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Given an integer,n, print its first 10 multiples.
Each multiple n x i (where 1<= i <=10) should be printed on a new line in the form: n x i = result.

Example

n=3

The printout should look like this:

3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30

 */

public class MultiplicationTable {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
    }


        }
class MultiplicationTable2 {

    public static void main(String[] args) {

        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

}


