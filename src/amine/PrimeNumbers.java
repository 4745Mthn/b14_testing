package amine;

public class PrimeNumbers {
    public static void main(String[] args) {

        //for loop to iterates from 1 to 100 and checks if it is prime\
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
        // even numbers cannot be prime
        //only even prime number is 2
        if (number != 2 && number % 2 == 0) {
            return false; // not prime
        }

        // 2 is the only even prime number
        if (number ==2){
            return true; // because it is prime
        }
        //check only odd numbers, even numbers cannot be prime, except #2

        //factor is a number that you can divide another number without remainders
        // 2 and 3 are factors of 6, and 6 can be divided by 2 and 3, giving a whole number result

        int factor = getFactor(number);
        // factors are only 1 and given number itself, total 2
        //example: factors of 2 is , 1 and 2, only 2 factors
        return factor == 2;
    }

    private static int getFactor(int number) {
        int factor = 0;
        //prime numbers only have number 1 and itself as factors,
        //example: factors of 2 is , 1 and 2
        for (int i = 1; i <= number; i += 2) {
            if (number % i == 0) {// there's no remainders, that means "i", is the factor of "number"
                factor++;
            }
        }
        return factor;
    }
}

/*
a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
 */
