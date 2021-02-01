package com.learning.practice.assignments.first;

import java.util.Scanner;

public class ColorCode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char inputChar;
        String color = "";

        System.out.print("Enter thr color code: ");
        inputChar = input.next().charAt(0);

        switch (inputChar) {
            case 'R':
                color ="Red";
                break;

            case 'B':
                color ="Blue";
                break;

            case 'G':
                color ="Green";
                break;

            case 'O':
                color ="Orange";
                break;

            case 'Y':
                color ="Yellow";
                break;
        }

        if(inputChar == 'R' || inputChar ==  'B' || inputChar ==  'G'|| inputChar ==  'O'|| inputChar ==  'Y') {
            System.out.printf("%c -> %s%n",inputChar,color);
        }  else {
            System.out.println("Invalid entry!");
        }
    }
}
