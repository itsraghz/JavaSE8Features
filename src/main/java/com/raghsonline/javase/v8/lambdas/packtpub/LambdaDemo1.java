package com.raghsonline.javase.v8.lambdas.packtpub;

/**
 * <p>
 *     Reference: Packtpub Video Course - Mastering Java SE 8 - 9781801072533
 *     <b>Java 8 Coding Demos: Lambda Expressions and Functional Interfaces</b>
 *     Video 5.3 - Coding and Referencing a Lambda Expression
 *     URL : https://beta.packtpub.com/reader/video/programming/9781801072533/p5/video5_3
 * </p>
 * <p>
 *     A class to demonstrate the Lambda Expressions and Functional Interfaces
 *     where two different Lambdas are demonstrated with a single line of
 *     execution or more than one line of execution.
 * </p>
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        lambdaDemo1();
        lambdaDemo2();
    }

    /**
     * <p>
     *     Version 1 of the Lambda - Simple / Plain
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
     *             The matching variable should be of type <code>Runnable</code>
     *             as the interface has a matching <code>run()</code>, which
     *             does not take any arguments and also does not return anything
     *             (<code>void</code>).
     *         </li>
     *         <li>
     *             The lambda is invoked using the <code>run()</code> method of the Runnable instance
     *         </li>
     *     </ol>
     * </p>
     * <p>
     *     <b>Note: </b> It is always a good and recommended practice to keep the
     *     Lambda Expression precise - in a single line, unless and otherwise demanded
     *     for a longer version.
     * </p>
     */
    private static void lambdaDemo1() {
        Runnable runnable = () -> System.out.println("Hello");
        runnable.run();
    }

    /**
     * <p>
     *     Version 2 of the Lambda - Simple / Plain
     * </p>
     * <p>
     *     <ol>
     *         <li>A multi-line lambda is being used.</li>
     *         <li>No Parameter (Input Argument)</li>
     *         <li>No Return Type(void)</li>
     *         <li>The curly braces are needed.</li>
     *         <li>A semicolon is necessary after the ending curly brace to demarcate the ending of the statement</li>
     *         <li>
     *             The lambda expression should be assigned to a Functional Interface
     *             which has a <b>SAM</b> (Single Abstract Method)
     *         </li>
     *         <li>
     *             The matching variable should be of type <code>Runnable</code>
     *             as the interface has a matching <code>run()</code>, which
     *             does not take any arguments and also does not return anything
     *             (<code>void</code>).
     *         </li>
     *         <li>
     *             The lambda is invoked using the <code>run()</code> method of the Runnable instance
     *         </li>
     *     </ol>
     * </p>
     * <p>
     *     <b>Note: </b> It is always a good and recommended practice to keep the
     *     Lambda Expression precise - in a single line, unless and otherwise demanded
     *     for a longer version.
     * </p>
     */
    private static void lambdaDemo2() {
        Runnable runnable = () ->  {
            String name = "Raghs";
            System.out.println("Hello " + name + "!");
        };
        runnable.run();
    }
}
