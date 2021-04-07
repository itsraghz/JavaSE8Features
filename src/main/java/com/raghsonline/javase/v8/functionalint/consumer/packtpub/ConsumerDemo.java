package com.raghsonline.javase.v8.functionalint.consumer.packtpub;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = fruit -> System.out.println("My favoreit fruit is :: " + fruit);
        consumer.accept("Apple");
    }
}
