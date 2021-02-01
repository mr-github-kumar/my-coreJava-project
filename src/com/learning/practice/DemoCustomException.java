package com.learning.practice;

class EmpInfoException extends Exception {
    String messageInfo;
    Integer exp;

    EmpInfoException (int exp) {
        this.exp = exp;
    }

    public String toString() {
        if(exp == 10){
            return messageInfo = "Your are senior resources";
        } else if(exp > 2 && exp < 5) {
            return messageInfo = "Your are junior resources";
        }
        return messageInfo;
    }
}

public class DemoCustomException {
    public static void main(String[] args){

        try {
            throw new EmpInfoException(9);
        } catch (EmpInfoException e){
            System.out.println(e);
        }
    }
}
