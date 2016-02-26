package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer[] integers = list.stream().filter(element -> (element > 2)).toArray(Integer[]::new);
        for (Integer i :integers){
            System.out.println(i);
        }
    }
}
