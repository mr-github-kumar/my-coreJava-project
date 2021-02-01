package com.learning.practice.assignments.first;

import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number:");

        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.print("Number is even.");
        }

        if (number % 2 != 0){
            System.out.print("Number is odd.");
        }
    }
}
