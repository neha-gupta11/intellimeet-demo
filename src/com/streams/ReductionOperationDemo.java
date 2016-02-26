package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionOperationDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer integer = list.stream()
                                .map(e -> e * 2)
                                .reduce(1, (a, b) -> a * b);
        System.out.println(integer);
    }
}
