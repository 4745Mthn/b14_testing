package great_team;

import java.util.Arrays;

public class Sorting2DArray {


    public static void main(String[] args) {
        int[][] numbers = {{9, 6, 4, 2}, {6, 3, 4, 3, 54}, {0, 5, 3, 1, 11, 3}, {5, 4, 3, 6, 9, 8, 7, 2}};

        for (int i = 1; i < numbers.length; i++ ){

            for ( int num = 0; num < numbers[0].length; num++){

                for (int j = i; j < numbers.length; j++)
                    if (numbers[j - 1][num] > numbers[j][num]) {

                        int temp = numbers[j][num];
                        numbers[j][num] = numbers[j - 1][num];
                        numbers[j - 1][num] = temp;


                    }
            }

        }
        System.out.println(Arrays.deepToString(numbers));


    }
}


/*
Given a 2D array containing int arrays with different length, sort and display the 2D array
Built in method are not allowed
 */
