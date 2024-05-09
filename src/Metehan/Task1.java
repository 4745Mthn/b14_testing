package Metehan;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial (int n) {

        int result = 1;

        while (n > 1) {
            result *= n--;
        }
        return result;

    }

}

  //    CREATE  a method that will accept an int number and return factorial of that number.
//    parameter:int
//    return:int
//    A factorial number is the product of all the positive integers that come before that number.String
//    5! stands for 5 factorial
//    5! = 5*4*3*2*1
//    ex
//    input: 5
//    output:120

