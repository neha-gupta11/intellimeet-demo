package com.java8;


import com.java7.ArithmeticOperations;

import java.util.Arrays;
import java.util.List;

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

    static void iterateList(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach((Integer i)-> {System.out.println(i);});
        list.forEach((i)-> {System.out.println(i);});
        list.forEach(i-> {System.out.println(i);});
        list.forEach(System.out::println);
    }
}
