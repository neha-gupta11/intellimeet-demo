package com.streams

import java.time.LocalDate
import java.time.LocalTime
import java.time.temporal.ChronoUnit
import java.time.temporal.TemporalUnit

List list = [1, 2, 3, 4, 5, 6, 7, 8]

Closure isEven = { e ->
    println "isEven ${e}"
    (e % 2 == 0)
}

Closure doubleIt = { e ->
    println "doubled ${e}"
    e * 2
}

println(
        list.findAll(isEven)
                .collect(doubleIt)
                .first()
)

System.out.println(
        list.stream().filter(isEven)
                .map(doubleIt)
                .findFirst()
);

