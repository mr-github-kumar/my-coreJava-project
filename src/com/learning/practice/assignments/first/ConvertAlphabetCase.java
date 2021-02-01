package com.learning.practice.assignments.first;

import java.util.Locale;
import java.util.Scanner;

public class ConvertAlphabetCase {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char oldCharacter;
        char newCharacter;

        System.out.print("Enter the Character: ");
        oldCharacter = input.next().charAt(0);

        if(Character.isLowerCase(oldCharacter)){
            newCharacter = Character.toUpperCase(oldCharacter);
        } else {
            newCharacter = Character.toLowerCase(oldCharacter);
        }

        System.out.printf("%c -> %c%n", oldCharacter,newCharacter);
    }
}
