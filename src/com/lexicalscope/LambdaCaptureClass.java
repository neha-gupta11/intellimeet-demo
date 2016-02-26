package com.lexicalscope;


import java.util.Arrays;
import java.util.List;

public class LambdaCaptureClass {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.forEach(x -> {
            int var = 10;
            System.out.println(x + var);
        });
        int var = 20;
    }
}
