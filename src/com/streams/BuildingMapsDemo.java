package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BuildingMapsDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Amit", 48),
                new Employee("Sumit", 17), new Employee("Sumit", 17));

        Map map = employeeList.stream().collect(Collectors.groupingBy(e->e.age));

        map.forEach((k, v) ->
                System.out.println(k+""+v)
        );
    }
}
