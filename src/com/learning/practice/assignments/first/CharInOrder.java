package com.learning.practice.assignments.first;

import java.util.Scanner;

public class CharInOrder {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        char firstChar;
        char secondChar;

        System.out.print("Enter the character: ");
        firstChar =scanner.next().charAt(0);

        System.out.print("Enter the character: ");
        secondChar =scanner.next().charAt(0);

        int compareChar= Character.compare(firstChar,secondChar);

        if(compareChar < 0) {
            System.out.printf("%s , %s%n",firstChar,secondChar );
        } else {
            System.out.printf("%s , %s%n",secondChar,firstChar );
        }
    }
}
