package com.lambda.intro;

public class GettingFamiliarWithLambdas {

    public static void main(String[] args) {
        anonymousFunctions();
        usingAsVariable();
        returningAsFunction();
    }

    static void anonymousFunctions(){
        //According to java7
        BasicFunction function = new BasicFunction() {
            @Override
            public void doSomething() {
                System.out.println("do something      ");
            }
        };

        //According to java8
        BasicFunction function1=()->{
            System.out.println("1");
            System.out.println("2");
        };
        function.doSomething();
    }

    static void usingAsVariable(){
        MyInterface add = (int a, int b) -> {
            System.out.println(a + b);
        };

        MyInterface sub = (a,b) -> {
            System.out.println(a - b);
        };

        perform(add, 10, 20);
        perform(sub, 20, 10);
    }

    static void perform(MyInterface operations, int a, int b) {
        operations.doSomething(a, b);
    }

    static void returningAsFunction(){

    }
}


