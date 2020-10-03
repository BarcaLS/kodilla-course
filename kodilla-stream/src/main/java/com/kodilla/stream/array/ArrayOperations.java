package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        System.out.println("Values of elements in array numbers:");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        System.out.println("Sum: " + IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .sum());
        OptionalDouble tempMedium = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        double medium = tempMedium.orElse(-1);
        System.out.println("Medium: " + medium);
        return medium;
    };
}
