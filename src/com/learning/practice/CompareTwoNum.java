package com.learning.practice;

import java.util.Scanner;

public class CompareTwoNum {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        if(num1 == num2) {
            System.out.printf("%d == %d%n", num1,num2);
        }

        if(num1 != num2) {
            System.out.printf("%d != %d%n", num1,num2);
        }

        if(num1 > num2) {
            System.out.printf("%d > %d%n", num1,num2);
        }

        if(num1 < num2) {
            System.out.printf("%d < %d%n", num1,num2);
        }

        if(num1 >= num2) {
            System.out.printf("%d >= %d%n", num1,num2);
        }

        if(num1 <= num2) {
            System.out.printf("%d <= %d%n", num1,num2);
        }
    }
}
