package com.rchab.core.exception;

//Note that the return statement after finally block is unreachable. Otherwise, if this line were not there, choices 1, 2, 3 are valid.
//    1) If input is "0.1" then it will return 0.1 and print finally.
//    2) If input is "0x.1" then it will return Float.Nan and print Invalid Input 0x.1 and finally.
//    3) If input is "1" then it will return 1.0 and print finally.


public class UnreachableReturn {
    public float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");  }
//        return f ;
    }
}
