package com.raghsonline.javase.v8;

import com.raghsonline.util.LoggerUtil;

public class Main {
    public static void main(String[] args) {
        LoggerUtil.log("JavaSE8 Features");
        quickCheck();
        //StreamsDemo.streamsDemo();
    }

    private static void quickCheck() {
        equalsCheckForNull();
        equalsMethodsOnStringVsStringBuffer();
    }

    private static void equalsMethodsOnStringVsStringBuffer() {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1.equals(s2)); // true
        StringBuffer sb1 = new StringBuffer("Java8");
        StringBuffer sb2 = new StringBuffer("Java8");
        System.out.println(sb1.equals(sb2)); // false
    }

    private static void equalsCheckForNull() {
        // 1. equals(null) should return false and not a NPE
        String s = "Java";
        System.out.println(s.equals(null));
    }
}
