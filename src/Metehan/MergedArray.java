package Metehan;

import java.util.Arrays;

public class MergedArray {

    /*
           Concat Arrays

           Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

           Ex:
               Input:
                   [SDET], [TEAMB14]
               Output:
                   [SDETTEAMB14]
        */
    public static void main(String[] args) {
        String[] arr1 = {"S,D,E,T"};
        String[] arr2 = {"T,E,A,M,B,1,4"};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));

    }

    public static String[] concatArrays(String[] arr1, String[] arr2) {


        String[] merged = new String[arr1.length  + arr2.length ];

        for (int i = 0, y = 0; i < merged.length ; i++) {

            if (i < arr1.length) {

                merged[i] = arr1[i];
            } else {
                merged[i] = arr2[y++];
            }
        }
        return merged;

    }
}








