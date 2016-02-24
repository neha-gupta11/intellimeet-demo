package com.intro.java7;

import java.util.Arrays;
import java.util.List;

public class Java7Demo {

    public static void main(String[] args) {
        iterateList();


        ArithmeticOperations add=new ArithmeticOperations() {
            @Override
            public void doSomething(int a, int b) {
                System.out.println(a+b);
            }
        };

        ArithmeticOperations sub=new ArithmeticOperations() {
            @Override
            public void doSomething(int a, int b) {
                System.out.println(a-b);
            }
        };

        perform(add,10,20);
        perform(sub,20,10);
    }

    static void perform(ArithmeticOperations operations, int a,int b){
        operations.doSomething(a, b);
    }

    static void iterateList(){
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
