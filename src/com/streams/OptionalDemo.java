package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list = Arrays.asList();

        Optional optional = list.stream().filter(e -> e > 2).findFirst();
        System.out.println(optional.orElseGet(() -> 5));
        ;
    }
}
