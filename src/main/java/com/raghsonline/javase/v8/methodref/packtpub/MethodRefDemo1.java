package com.raghsonline.javase.v8.methodref.packtpub;

import com.raghsonline.util.LoggerUtil;

import java.util.function.Consumer;

/**
 * <p>
 *     Reference: Packtpub Video Course - Mastering Java SE 8 - 9781801072533
 *     <b>Java 8 Coding Demos: Lambda Expressions and Functional Interfaces</b>
 *     Video 5.6 - Refactoring a Lambda Expression with its Method Reference
 *     URL : https://beta.packtpub.com/reader/video/programming/9781801072533/p5/video5_6/refactoring-a-lambda-expression-with-its-method-reference
 * </p>
 * <p>
 *     A class to demonstrate the Lambda Expressions and Functional Interfaces
 *     where two different Lambdas are demonstrated with a single line of
 *     execution or more than one line of execution.
 * </p>
 */
public class MethodRefDemo1 {

    public static void main(String[] args) {
        consumerEx1NoMethodRef();
        consumerEx2MethodRef();
    }

    private static void consumerEx2MethodRef() {
        Consumer<String> greetingFn2 = System.out::println;
        greetingFn2.accept("Hello from a Method Reference - Java8MethodRef");
    }

    private static void consumerEx1NoMethodRef() {
        Consumer<String> greetingFn = greeting -> LoggerUtil.log(greeting);
        greetingFn.accept("Java8Consumer with no Method Reference - Old School");
    }
}
