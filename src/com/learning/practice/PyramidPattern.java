package com.learning.practice;

import java.util.Scanner;

public class PyramidPattern {

    private static void printPattern1(int rows){

        //for loop for the rows
        for(int i = 1; i <+ rows; i++){

            //white space in front of the numbers
            int numberOfWhiteSpaces = rows -i;

            //print leading white space
            printString(" ", numberOfWhiteSpaces);

            printString(i + " ", i);

            //move the next line
            System.out.println("");
        }
    }

    //Utility function to print string given times
    private static void printString(String s, int times) {
        for(int j =0; j< times;j++){
            System.out.print(s);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the rows to print: ");
        int rows = scanner.nextInt();

        scanner.close();

        System.out.println("Printing pattern 1\n");
        printPattern1(rows);
    }
}
