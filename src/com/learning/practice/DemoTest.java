package com.learning.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoTest {

    public static void main(String[] args) {
        try {
            var a = 10;
            var b = 0;
            var result = a / b;
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
