package com.raghsonline.javase.v8.functionalint.consumer.packtpub;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        supplierDemo1SingleLine();
        supplierDemo2MultipleLines();
    }

    private static void supplierDemo2MultipleLines() {
        Supplier<Integer> supplier = () -> 42;
        System.out.println("Value returned from a Supplier :: " + supplier.get());
    }

    private static void supplierDemo1SingleLine() {
        Supplier<Integer> supplier2 = () -> {
            return 42;
        };
        System.out.println("Value returned from Supplier2 :: " + supplier2.get());
    }
}
