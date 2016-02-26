package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3};
        List list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Stream.of(integers).forEach(System.out::print);
    }
}
