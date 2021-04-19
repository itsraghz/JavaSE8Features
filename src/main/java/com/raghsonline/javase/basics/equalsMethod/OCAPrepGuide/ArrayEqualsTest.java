package com.raghsonline.javase.basics.equalsMethod.OCAPrepGuide;

import com.raghsonline.util.LoggerUtil;

import java.util.Arrays;

public class ArrayEqualsTest {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        LoggerUtil.log("bugs.equals(alias) ? " + bugs.equals(alias));
        LoggerUtil.log("bugs==alias ? " + (bugs==alias));
        LoggerUtil.log("bugs.toString() = " + bugs.toString());

        LoggerUtil.log("-- Cloned Object --");

        String[] cloned = new String[] {Arrays.toString(bugs)}; // a brand new object
        LoggerUtil.log("bugs.equals(cloned) ? " + bugs.equals(cloned));
        LoggerUtil.log("bugs==cloned ? " + (bugs==cloned));
        LoggerUtil.log("cloned.toString() = " + cloned.toString());
    }
}
