package com.streams;

import java.util.Arrays;
import java.util.List;

public class MatchedDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list.stream().allMatch(e->e>2));
        System.out.println(list.stream().anyMatch(e->e>7));
        System.out.println(list.stream().noneMatch(e->e>3));
        System.out.println(list.stream().count());
    }
}
