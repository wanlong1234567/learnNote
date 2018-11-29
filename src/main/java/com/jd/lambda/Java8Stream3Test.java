package com.jd.lambda;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;

public class Java8Stream3Test implements Supplier {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 3).limit(10). forEach(x -> System.out.print(x + " "));










        Random seed = new Random();
        Supplier<Integer> random = seed::nextInt;
        Stream.generate(random).limit(10).forEach(System.out::println);
//Another way
        IntStream.generate(() -> (int) (System.nanoTime() % 100)).
                limit(10).forEach(System.out::println);
    }
    @Override
    public Object get() {
        return null;
    }
//    Random seed = new Random();
//    Supplier<Integer> random = seed::nextInt;
//Stream.generate(random).limit(10).
//
//    forEach(System.out::println) {
//
//    }
////Another way
//IntStream.generate(() -> (int) (nanoTime() % 100)).
//    limit(10).forEach(out::println);

}
