package SDET;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Integer number;
        int length;
        int result;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        length = number.toString().length();

        result = reverseIntegerValue(number, length);
        System.out.println(result);
    }

    public static Integer reverseIntegerValue(Integer number, int length){

        int reverseNumber = 0;
        for(int i=0; i<length; i++){
            int digit = number%10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number/10;
        }

        return reverseNumber;
    }
}
