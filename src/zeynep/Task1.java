package zeynep;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(isHappy(42));
    }

    public static String isHappy(int n){

        while(n != 1 && n != 4){

            int sum = 0;

            while(n > 0){
                int eachDigit = n % 10;
                sum += eachDigit * eachDigit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1 ? "Happy" : "Unhappy";
    }





  //    create a method that will check if the given number is a happy or unhappy
//
//
//        A happy number is when sum of its digits aquared eventually result in 1.
//            HInt: read each digit of the number , square the number and take the number for the next number to be checked
//                An unhappy number is when the numbers consistentently end up as 4
//    Ex: 32-> Happy
//    breakdown:
//    32->3^2+2^2=9+4=13
//     13->1^2+3^2=1+9=10
//     10->1^2+0^2=1+0=1
//
}
