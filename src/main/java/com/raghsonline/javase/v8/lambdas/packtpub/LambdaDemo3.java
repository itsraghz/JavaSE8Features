package com.raghsonline.javase.v8.lambdas.packtpub;

import com.raghsonline.util.LoggerUtil;

/**
 * <p>
 *     Reference: Packtpub Video Course - Mastering Java SE 8 - 9781801072533
 *     <b>Java 8 Coding Demos: Lambda Expressions and Functional Interfaces</b>
 *     Video 5.5 - Providing Alternative Functional Interface Target Types for a Lambda Expression
 *     URL : https://beta.packtpub.com/reader/video/programming/9781801072533/p5/video5_5/providing-alternative-functional-interface-target-types-for-a-lambda-expression
 * </p>
 * <p>
 *     A class to demonstrate the Lambda Expressions and Functional Interfaces
 *     where the lambda expression can be assigned to more than one matching
 *     functional interface as a Target Type - not necessarily the <code>Runnable</code>.
 * </p>
 */
public class LambdaDemo3 {

    public static void main(String[] args) {
        lambdaDemo4();
    }

    /**
     * <p>
     *     Version 4 of the Lambda - Simple / Plain but with more than one Target Types
     * </p>
     * <p>
     *     <ol>
     *         <li>A single line lambda is being used.</li>
     *         <li>No Parameter (Input Argument)</li>
     *         <li>No Return Type(void)</li>
     *         <li>No curly braces needed.</li>
     *         <li>
     *             The lambda expression should be assigned to a Functional Interface
     *             which has a <b>SAM</b> (Single Abstract Method)
     *         </li>
     *         <li>
     *             The matching variable can be of any matching Target type
     *             (Functional Interface) that has a <b>SAM</b> - Single Abstract
     *             Method with the matching characteristics - in this example,
     *             no argument and no return type (void). We have a default
     *             <code>Runnable</code> class from <tt>java.lang</tt> package that
     *             has the <code>run()</code> method and a custom
     *             <tt>@FunctionalInterface</tt> <code>Executor</code>
     *             which has the SAM named <tt>execute()</tt> - whereas both of
     *             them match the characteristics of the Lambda being used.
     *         </li>
     *         <li>
     *             The lambda is invoked using the <code>run()</code> method of
     *             the <code>Runnable</code>> instance, and the <code>execute()</code>
     *             method of the <code>Executor</code> instance.
     *         </li>
     *         <li>
     *             The name of the SAM is immaterial here.
     *         </li>
     *     </ol>
     * </p>
     */
    private static void lambdaDemo4() {
        Runnable r = () -> LoggerUtil.log("Hello - from a Lambda of Runnable Instance run() method");
        Executor e = () -> LoggerUtil.log("Hello - from a Lambda of Executor Instance execute() method");

        r.run();
        e.execute();
    }

    @FunctionalInterface
    interface Executor {
        void execute();
    }
}
