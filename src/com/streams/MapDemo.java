package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional optional = list.stream().map(a -> { return (a * 5);}).findFirst();
        System.out.println(optional);
    }
}
