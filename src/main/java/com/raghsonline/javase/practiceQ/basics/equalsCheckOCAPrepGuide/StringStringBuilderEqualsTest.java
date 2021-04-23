package com.raghsonline.javase.practiceQ.basics.equalsCheckOCAPrepGuide;

/**
 * <p>
 *     OCA Prep Guide by Scott Selikoff and Jeyanne Boyarsky
 *     Chapter 3 - Core Java APIs - Review Qn 5
 * </p>
 * <p>
 *     A class to demonstrate that the <tt>==</tt> operator
 *     can NOT be called on a <tt>String</tt> and a <tt>StringBuilder</tt>
 *     instances
 * </p>
 */
public class StringStringBuilderEqualsTest {
    public static void main(String[] args) {
        String s1 = "java";
        StringBuilder sb = new StringBuilder("java");
        /* Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder' */
        //if(s1==sb)
        //    System.out.println("1");
        if(s1.equals(sb))
            System.out.println("2");
    }
}
