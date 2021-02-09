package SDET;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Integer number;
        Integer factorialIt;
        Integer factorialRec;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();
        factorialIt = factorialIteration(number);
        System.out.println("factorial iteration = " + factorialIt);
        factorialRec = factorialRecursion(number);
        System.out.println("factorial recursion = " + factorialRec);
    }

    public static Integer factorialIteration(Integer number){
        Integer result = 1;
        if (number == 0 || number == 1){
            result = 1;
        }
        else{
            for(int itr = number; itr >0; itr--){
                result = result * itr;
            }
        }
        return result;
    }

    public static Integer factorialRecursion(Integer number){
        Integer result = 1;
        if (number == 0 || number == 1){
            result = 1;
        }
        else{
            result = number * factorialRecursion(number -1);
        }
        return result;
    }

}
