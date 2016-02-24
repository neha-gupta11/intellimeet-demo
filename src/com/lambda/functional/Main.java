package com.lambda.functional;


public class Main {
    public static void main(String[] args) {
        MyInterface mylambda =(a,b)->{
           return a+b;
        };
        mylambda.operation(2,3);
    }
}
