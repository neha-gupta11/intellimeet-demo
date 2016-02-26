package com.defaultmethods;


public class OverridingDefault implements DefaultDemo{
    public void display(){
        System.out.println("OverridingDefault");
    }

    public static void main(String[] args) {
        OverridingDefault overridingDefault=new OverridingDefault();
        overridingDefault.display();
    }
}
