package com.raghsonline.javase.v8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractices {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 5, 12, 8, 3, 13, 0, 15);
        sumStream(intList);
        reverseAList(intList);
    }

    private static void reverseAList(List<Integer> intList) {
        intList.stream().mapToInt(i -> i);
    }

    private static void sumStream(List<Integer> intList) {
        int sum = intList.stream()
                .filter(x -> x > 10)
                .peek(x -> System.out.println("Element selected : " + x))
                .mapToInt(x -> x)
                .sum();

        System.out.println("Sum of all numbers greater than 10 :: " + sum);
    }
}
