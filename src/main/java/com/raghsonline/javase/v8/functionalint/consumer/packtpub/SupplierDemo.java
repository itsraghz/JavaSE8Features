package com.raghsonline.javase.v8.functionalint.consumer.packtpub;

import java.util.function.IntSupplier;

import static com.raghsonline.util.LoggerUtil.log;

public class SupplierDemo {
    public static void main(String[] args) {
        supplierDemo1SingleLine();
        supplierDemo2MultipleLines();
    }

    /**
     * <p>
     *     <code>Supplier<Integer> supplier = () -> 42;</code>
     *      is reported as a SonarLint Violation (Medium Severity) as follows
     * </p>
     * <p>
     *     Functional Interfaces should be as specialised as possible
     *      <code>Code smell | Minor | java:S4276</code>
     * </p>
     * <pre>
     *     Actual / Original Version:
     *     --------------------------
     *     Supplier<Integer> supplier2 = () -> 42;
     *     int value = supplier.get();
     *
     *     Revised version as per SonarLint Comment
     *     ----------------------------------------
     *     IntSupplier supplier = () -> 42;
     *     int value = supplier.getAsInt();
     * </pre>
     */
    private static void supplierDemo2MultipleLines() {
        IntSupplier supplier = () -> 42;
        log("Value returned from a Supplier :: " + supplier.getAsInt());
    }

    private static void supplierDemo1SingleLine() {
        IntSupplier supplier2 = () -> {
            return 42;
        };
        log("Value returned from Supplier2 :: " + supplier2.getAsInt());
    }
}
