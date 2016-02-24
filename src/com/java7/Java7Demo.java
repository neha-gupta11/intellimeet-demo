package com.java7;

public class Java7Demo {

    public static void main(String[] args) {
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
        operations.doSomething(a,b);
    }

}
