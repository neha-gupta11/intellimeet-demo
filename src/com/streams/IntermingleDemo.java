package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntermingleDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println(
                list.stream().filter(e -> e % 2 == 0)
                             .map(e->e*2)
                             .findFirst()
        );
    }
}
