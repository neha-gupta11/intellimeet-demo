package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5);
        IntStream intStream2 = IntStream.range(3, 9);
        IntStream intStream3 = list.stream().mapToInt(e -> e);
        IntStream intStream4 = list.stream().mapToInt(e -> e);
        System.out.println(intStream1.max().getAsInt());
        System.out.println(intStream2.min().getAsInt());
        System.out.println(intStream3.sum());
        System.out.println(intStream4.average().getAsDouble());

    }
}
