package SDET;

import java.util.Scanner;

public class SwappingTwoNumbers {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        System.out.println("enter the first number");
        x = input.nextDouble();
        System.out.println("enter the second number");
        y = input.nextDouble();
        System.out.println("Before swaping x = " + x + "y = " + y);
        swap(x, y);
    }

    public static void swap(double x, double y){
        x = x +y;
        System.out.println("x = " + x + " y = " + y);
        y = x - y;
        System.out.println("x = " + x + " y = " + y);
        x = x - y;
        System.out.println("x = " + x + " y = " + y);
    }

}
