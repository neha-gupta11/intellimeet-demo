package com.lambda.functional;


public class Main {
    public static void main(String[] args) {
//        MyInterface mylambda =(int a,int b)->{
//           return a+b;
//        };

//        MyInterface mylambda =(a,b)->{
//           return a+b;
//        };

        MyInterface mylambda =(a,b)->a+b;

        mylambda.operation(2,3);
    }
}
