package com.learning.practice.assignments.first;

import java.util.Scanner;

public class CheckCommandLineArgument {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String value;
        char comma = ',';

        System.out.print("Enter the value: ");
        value = input.nextLine();

        if (value.length() == 0){
            System.out.println("No Values");
        }
        else {
            //Replace space with comma
            value = value.replace(' ', comma);
            System.out.println(value);
        }
    }
}
