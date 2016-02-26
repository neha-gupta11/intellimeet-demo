package com.functions;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        //Simple typed interfaces
        DoublePredicate doublePredicate=(a)-> a<10.0;
        System.out.println(doublePredicate.test(19.0));
        System.out.println(doublePredicate.test(1.0));

        IntConsumer intConsumer=System.out::println;
        intConsumer.accept(10);

        LongUnaryOperator longUnaryOperator=(a)->a*10;
        System.out.println(longUnaryOperator.applyAsLong(10));
        System.out.println(longUnaryOperator.applyAsLong(200));

        //Generically typed interfaces
        Consumer<Integer> consumer=System.out::println;
        consumer.accept(9);

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        Supplier<Integer> getLastElement=()->list.get(list.size()-1);
        System.out.println(getLastElement.get());

        Predicate<Integer> predicate=(a)->a<50;
        Integer i=getLastElement.get();
        System.out.println(predicate.test(i));

        Function<Integer,Boolean> oddEven=(a)->a%2==0;
        System.out.println(oddEven.apply(10));
        System.out.println(oddEven.apply(11));
    }
}
