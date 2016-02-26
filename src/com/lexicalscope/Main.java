package com.lexicalscope;


public class Main {

    public static void main(String[] args) {
        int a = 10;

        MyInterface obj = (x, y) -> {
            int c = x + y;
            return c + a;
        };


    }

}
