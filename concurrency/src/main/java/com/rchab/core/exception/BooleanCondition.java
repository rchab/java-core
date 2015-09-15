package com.rchab.core.exception;

// it is not runtime exception
// it is compilation error.
// You need a boolean in the 'if' condition. Here, compiler sees that there is no way x/y can produce a boolean so it generates an error at compile time.

public class BooleanCondition {
    public static void main(String[] args){
        int x = 1;
        int y = 0;
//        if( x/y ) System.out.println("Good");
//        else  System.out.println("Bad");
    }
}
