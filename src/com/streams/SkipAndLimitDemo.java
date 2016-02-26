package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimitDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List list1 = list.stream().limit(3).skip(1).collect(Collectors.toList());
        System.out.println(list1);
    }
}
