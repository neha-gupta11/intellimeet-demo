package com.streams;

import java.util.*;

public class MapToIntDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        OptionalDouble optionalDouble = list.stream().mapToInt(a -> a).average();
        System.out.println(optionalDouble);
    }
}
