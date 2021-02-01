package com.learning.practice.assignments.first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthsFromNumToWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int monthNum = 0;

        do {
            try {
                System.out.print("Please enter the month: ");;
                monthNum = input.nextInt();

                String month = "";

                switch (monthNum){
                    case 1:
                        month = "January";
                        break;
                    case 2:
                        month = "February";
                        break;
                    case 3:
                        month = "March";
                        break;
                    case 4:
                        month = "April";
                        break;
                    case 5:
                        month = "May";
                        break;
                    case 6:
                        month = "June";
                        break;
                    case 7:
                        month = "July";
                        break;
                    case 8:
                        month = "August";
                        break;
                    case 9:
                        month = "September";
                        break;
                    case 10:
                        month = "October";
                        break;
                    case 11:
                        month = "November";
                        break;
                    case 12:
                        month = "December";
                        break;
                }

                if(monthNum <= 0 || monthNum > 12){
                    System.out.println("Invalid Month!");
                } else {
                    System.out.printf("This is %s month%n",month);
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter the month in numbers only!");;
            }

            input.nextLine();
        } while (!Character.isDigit(monthNum));


    }
}
