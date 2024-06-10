package dilovar;

import java.util.ArrayList;

public class PrimeNumbers {
//  Create a new class with name PrimeNumbers under your names pakage,
//  Complete the task "Prime numbers between 1 and 100" and push it to the 4745Mthn/b14_testing please.
//  if you don't want to have any problem, before start project make sure your b14_testing project is up-to-date.

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            int count = 0;
            for (int j = 1; j < 101; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primes.add(i);
            }
        }
        System.out.println(primes);

    }
}
