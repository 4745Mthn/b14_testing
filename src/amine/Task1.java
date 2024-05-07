package amine;

public class Task1 {

    public static void main(String[] args) {
        checkDivisibility(15);
    }

    public static void checkDivisibility(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("TestCoders");
            } else if (i % 3 == 0 && i % 2 == 0) {
                System.out.println("CodilityTest");

            } else {
                if (i % 5 == 0) {
                    System.out.println("Coders");
                } else if (i % 3 == 0) {
                    System.out.println("Test");
                } else if (i % 2 == 0) {
                    System.out.println("Codility");
                } else {
                    System.out.println(i);
                }

            }
        }
//    Consecutive Numbers
//            create method to print consecutive numbers from 1 to N, each on a seperate line.However, any number divisible by 2,3 or 5 should be replaced by word Codility,Test and Coders respectively. if a number is divisible by more than oneof the numbers it should be the given N value will be a positive integer.
//            parameter: int
//    return:void
//    example of number being divisible 2 & 3:
//    when number is 6 the output should be CodilityTest because 6 is divisible by 2 & 3
//example of number being divisible 2 & 5:
        //    when number is 10 the output should be CodilityCoders because 6 is divisible by 2 & 3

    }
}
