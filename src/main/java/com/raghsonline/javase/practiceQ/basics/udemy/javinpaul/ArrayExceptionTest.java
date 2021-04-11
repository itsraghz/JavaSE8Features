package com.raghsonline.javase.practiceQ.basics.udemy.javinpaul;

/**
 * <p>
 *     OCP Java SE 11 Developer Practice Tests Course in Udemy by Javin Paul
 * </p>
 * <p>
 *     A program to test the <code>ArrayIndexOutOfBoundsException</code> and the
 *     exception handling together.
 * </p>
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        try {
            new Recipe().cook();
        } catch (Throwable e) {
            System.out.print("Caught!");
        }
    }
}

class BadRecipeException extends Exception {}

class Recipe {
    public void cook() throws BadRecipeException {
        /* Ensure IDE is set to support Java SE 10 or later */
        var ingredients = new int[0];
        System.out.println(ingredients[0]);
    }
}
