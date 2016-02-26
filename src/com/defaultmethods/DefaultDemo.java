package com.defaultmethods;


public interface DefaultDemo {
    default void display(){
        System.out.println("Display");
    }
}
