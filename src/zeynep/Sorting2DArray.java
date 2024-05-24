package zeynep;

import java.util.Arrays;

public class Sorting2DArray {


    public static void main(String[] args) {

        int[][] numbers = {{9, 6, 4, 2}, {6, 3, 4, 3, 54}, {0, 5, 3, 1, 11, 3}, {5, 4, 3, 6, 9, 8, 7, 2}};

        for (int i = 0; i < numbers.length; i++ ){

            for ( int num = 0; num < numbers[i].length - 1; num++){

                for (int j = num + 1; j < numbers[i].length; j++)
                    if (numbers[i][num] > numbers[i][j]) {

                        int temp = numbers[i][j];
                        numbers[i][j] = numbers[i][num];
                        numbers[i][num] = temp;


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

