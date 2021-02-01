package com.learning.practice.assignments.first;

import java.util.Scanner;

public class CheckNumbers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number is positive.");
        }
        if (number == 0) {
            System.out.println("Number is zero.");
        }
        if (number < 0) {
            System.out.println("Number is negative.");
        }
    }
}
