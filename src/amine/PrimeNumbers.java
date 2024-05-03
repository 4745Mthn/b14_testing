package amine;

public class PrimeNumbers {
    public static void main(String[] args) {

        //for loop to iterates from 1 to 100 and check if it is prime\
        //and displays prime numbers


        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        //check number and return true if it's prime

        //check if the number is even
        if (number != 2 && number % 2 == 0) {
            return false;
        }

        // 2 is the only even prime number
        if (number ==2){
            return true;
        }
        //check only odd numbers, even numbers cannot be prime, except #2
        int factor = 0;
        //prime numbers only have 1 and itself as factors
        for (int i = 1; i <= number; i += 2) {
            if (number % i == 0) {
                factor++;
            }
        }
        // factors are only 1 and given number itself, total 2
        return factor == 2;
    }

}


/*
a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
 */
