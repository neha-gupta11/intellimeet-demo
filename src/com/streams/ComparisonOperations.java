package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparisonOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Amit", 48),
                new Employee("Sumit", 17), new Employee("Sumit", 17));

        employeeList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList())
                .forEach(System.out::println);


        Optional<Employee> optionalMax = employeeList.stream().max((e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println(optionalMax.get());

        Optional<Employee> optionalMin = employeeList.stream().min((e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println(optionalMin.get());
        System.out.println(">>>>>>>>>>>>>>>>>");
        employeeList.stream().distinct().forEach(System.out::println);
    }
}
