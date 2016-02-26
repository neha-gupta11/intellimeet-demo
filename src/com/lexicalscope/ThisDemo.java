package com.lexicalscope;


public class ThisDemo {
    Integer integer = 1;

    void innerClassMethod() {

        Integer integer = 3;
        Consumer innerClass = new Consumer() {
            Integer integer = 2;

            public void display() {
                System.out.println("From inner class " + this.integer);
            }
        };
        innerClass.display();
    }

    void lambdaMethod() {
        Consumer lambda = () -> {
            System.out.println("From lambda " + this.integer);      //refering to context of thisDemo
        };
        lambda.display();
    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        thisDemo.innerClassMethod();
        thisDemo.lambdaMethod();
    }

}
