package com.raghsonline.javase.basics.api.OCAPrepGuide;

import com.raghsonline.util.LoggerUtil;

import java.util.HashMap;
import java.util.Map;

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
        /*test3MyOwnAppendBoolean();
        test4MyOwnInitSBWithNullThrowsNPE();*/
        test5MyOwnStringBuilderEquals();
        test6MyOwnStringHashKey();
        test6MyOwnStringBuilderHashKey();
    }

    private static void test5MyOwnStringBuilderEquals() {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        LoggerUtil.log("sb1 : [" + sb1 + "], hashcode = " + sb1.hashCode());
        LoggerUtil.log("sb2 : [" + sb2 + "], hashcode = " + sb2.hashCode());
        LoggerUtil.log("sb1==sb2  ? " + (sb1==sb2));
        LoggerUtil.log("sb1.equals(s2) ? " + sb1.equals(sb2));
        LoggerUtil.log("sb1.toString().equals(sb2.toString()) ? " + sb1.toString().equals(sb2.toString()));
    }

    private static void test6MyOwnStringBuilderHashKey() {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        LoggerUtil.log("sb1 : [" + sb1 + "], hashcode = " + sb1.hashCode());
        LoggerUtil.log("sb2 : [" + sb2 + "], hashcode = " + sb2.hashCode());
        Map<Object, String> map = new HashMap<>();
        map.put(sb1, "ABC");
        map.put(sb2, "ABC");
        LoggerUtil.log("map contains -> " + map);
    }

    private static void test6MyOwnStringHashKey() {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        LoggerUtil.log("s1 : [" + s1 + "], hashcode = " + s1.hashCode());
        LoggerUtil.log("s2 : [" + s2 + "], hashcode = " + s2.hashCode());
        Map<Object, String> map = new HashMap<>();
        map.put(s1, "ABC");
        map.put(s2, "ABC");
        LoggerUtil.log("map contains -> " + map);
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
