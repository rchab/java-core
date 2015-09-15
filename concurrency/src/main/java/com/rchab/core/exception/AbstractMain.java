package com.rchab.core.exception;

abstract class AbstractMain {
    abstract void calculate();
    public static void main(String[] args){
        System.out.println("calculating");
        AbstractMain x = null;
        x.calculate();
    }
}
