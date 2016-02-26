package com.methodreference;


public class MethodReference {
    static void staticMethod() {
        System.out.println("static method");
    }

    void instanceMethod() {
        System.out.println("instance method");
    }

    MethodReference() {
        System.out.println("constructor method");
    }

    public static void main(String[] args) {
        //static method reference
        MethodReferenceInterface staticMethodReference = MethodReference::staticMethod;
        staticMethodReference.display();

        //instance method reference
        MethodReference methodRefrence = new MethodReference();
        MethodReferenceInterface instanceMethodReference = methodRefrence::instanceMethod;
        instanceMethodReference.display();

        //constructor method reference
        MethodReferenceInterface constructorMethodReference = MethodReference::new;
        constructorMethodReference.display();
    }
}
