package com.java8;


import com.java7.ArithmeticOperations;

public class Java8Demo {
    public static void main(String[] args) {
        ArithmeticOperations add = (int a, int b) -> {
            System.out.println(a + b);
        };

        ArithmeticOperations sub = (a,b) -> {
            System.out.println(a - b);
        };


        perform(add, 10, 20);
        perform(sub, 20, 10);
    }

    static void perform(ArithmeticOperations operations, int a, int b) {
        operations.doSomething(a, b);
    }
}
