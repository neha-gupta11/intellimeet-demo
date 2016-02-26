package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
        List list1 = list.stream().filter(element -> element > 2).collect(Collectors.toList());
        System.out.println(list1);
        Set set = list.stream().filter(element -> element > 2).collect(Collectors.toSet());
        System.out.println(set);
        Map map = list.stream().filter(element -> element > 2).collect(Collectors.toMap(e -> e, e -> e * 2));
        System.out.println(map);

        Integer summedIntegers = list.stream().collect(Collectors.summingInt(e -> e));
        System.out.println(summedIntegers);

        Double averaged = list.stream().collect(Collectors.averagingInt(e -> e));
        System.out.println(averaged);

        Long count= list.stream().collect(Collectors.counting());
        System.out.println(count);

        List<String> stringList = Arrays.asList("abc", "defg", "hij");
        String joinedString = stringList.stream().collect(Collectors.joining(","));
        System.out.println(joinedString);


    }
}
