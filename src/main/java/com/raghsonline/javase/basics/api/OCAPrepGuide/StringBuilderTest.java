package com.raghsonline.javase.basics.api.OCAPrepGuide;

import com.raghsonline.util.LoggerUtil;

/**
 * <p>
 *     A Java class to demonstrate the following characteristics of the
 *     <tt>StringBuilder</tt> API and class methods.
 * </p>
 * <p>
 *     <ul>
 *         <li>
 *             <tt>StringBuilder</tt> is an Immutable object, unlike <tt>String</tt>
 *         </li>
 *         <li>
 *             Most of the StringBuilder Class API methods that manipulate the content,
 *             return the object itself, that removes the need for an explicit assignment
 *             of the result to the object back.
 *         </li>
 *     </ul>
 * </p>
 * @author raghs
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        /*test1MyOwn();
        test2Ch4Page112();*/
        test3MyOwnAppendBoolean();
        test4MyOwnInitSBWithNullThrowsNPE();
    }

    /**
     * <p>
     *     This method should throw a NPE as we are purposefully
     *     testing a StringBuilder with a null while intiailizing.
     * </p>
     */
    private static void test4MyOwnInitSBWithNullThrowsNPE() {
        StringBuilder sb = new StringBuilder(null);
        printSBStats("SB initialized with null", sb);
    }

    private static void test3MyOwnAppendBoolean() {
        StringBuilder sb = new StringBuilder();
        printSBStats("Initial", sb);
        sb.append("true");
        printSBStats("Adding a Boolean TRUE", sb);
    }

    private static void printSBStats(String msg, StringBuilder sb) {
        StringBuilder sbStatsBlder = new StringBuilder("[" + msg + "] Stats of StringBuilder - ");
        sbStatsBlder.append("Length : " + sb.length())
                .append(", Capacity : " + sb.capacity())
                .append(", Content : " + sb);

        LoggerUtil.log(sbStatsBlder.toString());
    }

    private static void test2Ch4Page112() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b= b.append("f").append("g");
        b.append("h");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void test1MyOwn() {
        StringBuilder sb = new StringBuilder();
        int capacity = sb.capacity();
        System.out.println("Capacity of an empty StringBuilder object :: " + capacity);
        sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.append(" [No need to explicitly assign back the reference]");
        System.out.println("String Builder after appending :: " + sb);
        capacity = sb.capacity();
        System.out.println("Capacity of an appended StringBuilder object :: " + capacity);
    }
}
