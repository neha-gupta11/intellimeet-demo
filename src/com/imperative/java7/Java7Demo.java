package com.imperative.java7;

import com.intro.java7.ArithmeticOperations;

import java.util.Arrays;
import java.util.List;

public class Java7Demo {

    public static void main(String[] args) {
        iterateList();
    }

    static void iterateList(){
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
