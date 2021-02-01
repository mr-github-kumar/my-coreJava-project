package com.learning.practice.assignments.first;

import java.util.Locale;
import java.util.Scanner;

public class InterestRateBasedOnGender {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String gender;
        int age;

        System.out.print("Enter the Gender(Female/Male): ");
        gender = input.nextLine().toLowerCase();

        System.out.print("Enter the Age(1-120): ");
        age = input.nextInt();

        if(gender.equals("female") && (age >=1 && age <= 58)){
            System.out.print("Interest: 8.2%");
        } else if(gender.equals("female") && (age >= 59 && age <= 120)){
            System.out.print("Interest: 7.6%");
        } else if(gender.equals("male") && (age >= 1 && age <= 60)){
            System.out.print("Interest: 9.2%");
        } else if(gender.equals("male") && (age >= 61 && age <= 120)){
            System.out.print("Interest: 8.3%");
        }

        if(age < 1 || age > 120){
            System.out.println("Invalid age!");
        }
        if(!gender.equals("female") && (!gender.equals("male"))){
            System.out.println("Invalid gender!");
        }
    }
}
