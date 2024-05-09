package dilovar;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(-153));
        System.out.println(isArmstrongNumber2(153));


    }
    public static boolean isArmstrongNumber(int num){
        int result=0;
        int originalNumber=num;
        int n=0;//length of digit num
        while(originalNumber!=0){
            originalNumber/=10;//removes the last digit;
            n++;//gives number length
        }
        originalNumber=num;//after removing originalnumber becomes 0 we have to reassign


        while(originalNumber!=0){
            int eachDigit=originalNumber%10;//read the last digit
            result+=Math.pow(eachDigit,n);//last digit to power of n
            originalNumber/=10;//removes last digit
        }



        return result==num;

    }
    public static boolean isArmstrongNumber2(int n){
        String strNum=Integer.toString(n);
        int result=0;
        //String strNum=""+n;
        int power=strNum.length();
        for (int i = 0; i <strNum.length() ; i++) {
            int eachDigit=Integer.parseInt(strNum.substring(i,i+1));//""+strNum.charAt(i)
            result+=Math.pow(eachDigit,power);
        }
        return result==n;

    }
    /* check if nymber is Armstrong Number
    * parameter: int
    * return boolean
    * An Armstrong number is a number thats digits can be raised to the power of total number of digits and summed to the
    * equal the original number
    * ex input:153
    * output true
    * the digits are 1,5,3
    * the calculation would be :
    * 1^3+5^3+3^3=153
    * */
}
