package com.learning.practice.assignments.first;

import java.util.Scanner;

public class CheckCharType {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        char value;

        System.out.print("Enter the character: ");
        value =scanner.next().charAt(0);

        if((value >= 48 && value <= 57) || value == 45)
        {
            System.out.print("Digit");

        }
        else if((value >= 'a' && value <= 'z')||(value >= 'A' && value <= 'Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("Special character");

        }
    }

}
