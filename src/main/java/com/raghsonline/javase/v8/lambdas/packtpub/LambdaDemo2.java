package com.raghsonline.javase.v8.lambdas.packtpub;

/**
 * <p>
 *     Reference: Packtpub Video Course - Mastering Java SE 8 - 9781801072533
 *     <b>Java 8 Coding Demos: Lambda Expressions and Functional Interfaces</b>
 *     Video 5.4 - Refactoring a Lambda Expression by Adapting an Existing Functional Interface
 *     URL : https://beta.packtpub.com/reader/video/programming/9781801072533/p5/video5_4/refactoring-a-lambda-expression-by-adapting-an-existing-functional-interface
 * </p>
 * <p>
 *     A class to demonstrate the Lambdas and Functional Programming concepts,
 *     where we can have a lambda with a single parameter (input argument) which
 *     can be assigned to a custom Functional Interface with a SAM (Single Abstract Method)
 *     with a parameter (input). The reason being, the JDK API classes do have only a
 *     functional interface with a SAM - that takes no arguments and returns void)
 * </p>
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        lambdaDemo3();
    }

    /**
     * <p>
     *     Version 3 of the Lambda - with a parameter
     * </p>
     * <p>
     *     <ol>
     *         <li>A single line lambda is being used.</li>
     *         <li>An input Parameter (Input Argument) is passed</li>
     *         <li>No Return Type(void)</li>
     *         <li>No curly braces needed.</li>
     *         <li>
     *             The lambda expression should be assigned to a Functional Interface
     *             which has a <b>SAM</b> (Single Abstract Method)
     *         </li>
     *         <li>
     *             The matching variable is assigned to the custom functional
     *             interface created in this class named <code>StringRunnable</code>
     *             to have a SAM (Single Abstract Method) <code>run(String)</code>,
     *             that takes a single argument (String) and returns nothing
     *             (<code>void</code>).
     *         </li>
     *         <li>
     *             The lambda is invoked using the <code>run()</code> method of
     *             the <tt>StringRunnable</tt> instance by passing an input
     *             argument / parameter that is demanded by the Compiler for the
     *             matching SAM in the Interface.
     *         </li>
     *     </ol>
     * </p>
     */
    private static void lambdaDemo3() {
        StringRunnable sr = (name) -> System.out.println("Hello " + name + "!");
        sr.run("Raghs");
    }

    /**
     * <p>
     *     A custom functional interface created with the newly created
     *     annotation <code>FunctionalInterface</code>, to have a
     *     SAM (Single Abstract Method) with a parameter (input).
     * </p>
     */
    @FunctionalInterface
    interface StringRunnable
    {
        void run(String s);
    }
}
