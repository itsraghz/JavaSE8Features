package com.raghsonline.javase.basics.arraysMethods.OracleUniv;

import com.raghsonline.util.LoggerUtil;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) return 1;
        if(o1.length() < o2.length()) return -1;
        return 0;
    }
}
public class ArraysClassMethosDemo {

    public static void main(String[] args) {
        arraysFillMethodDemo();
        arraysEqualsMethodDemo();
        arraysSortDefaultComparatorDemo();
        arraysSortCustomComparatorDemo();
    }

    private static void arraysSortCustomComparatorDemo() {
        LoggerUtil.log("--------------------------------------------------");
        LoggerUtil.log("Arrays Sort Method Demo - using Custom Comparator");
        LoggerUtil.log("--------------------------------------------------");
        String[] names1 =  new String[] {"Mary", "Ann", "Jane", "Tom"};
        String[] names2 =  new String[] {"Mary", "Ann", "John", "Tom"};
        LoggerUtil.log("Names Array 2 - Before Sorting : " + Arrays.toString(names2));
        Arrays.sort(names2, new LengthCompare());
        LoggerUtil.log("Names Array 2 - After Sorting : " + Arrays.toString(names2));
        LoggerUtil.log("[##] Note : Custom Comparator sorts the elements based on the length of elements in ascending order, in this example");
    }

    private static void arraysSortDefaultComparatorDemo() {
        LoggerUtil.log("--------------------------------------------------");
        LoggerUtil.log("Arrays Sort Method Demo - using Default Comparator");
        LoggerUtil.log("--------------------------------------------------");
        String[] names1 =  new String[] {"Mary", "Ann", "Jane", "Tom"};
        String[] names2 =  new String[] {"Mary", "Ann", "John", "Tom"};
        LoggerUtil.log("Names Array 2 - Before Sorting : " + Arrays.toString(names2));
        Arrays.sort(names2);
        LoggerUtil.log("Names Array 2 - After Sorting : " + Arrays.toString(names2));
        LoggerUtil.log("[##] Note : Default Comparator sorts the elements in a natural order. String class does it alphabetically");
    }

    private static void arraysEqualsMethodDemo() {
        Object obj = null;

        LoggerUtil.log("-------------------------");
        LoggerUtil.log("Arrays Equals Method Demo");
        LoggerUtil.log("-------------------------");
        String[] names1 =  new String[] {"Mary", "Ann", "Jane", "Tom"};
        String[] names2 =  new String[] {"Mary", "Ann", "John", "Tom"};
        LoggerUtil.log("Names Array 1 : " + Arrays.toString(names1));
        LoggerUtil.log("Names Array 2 : " + Arrays.toString(names2));
        boolean isTheSame = Arrays.equals(names1, names2);
        LoggerUtil.log("Are the arrays equal by reference (==) ? " + (names1==names2));
        LoggerUtil.log("Are the arrays equal ? " + isTheSame);
    }

    private static void arraysFillMethodDemo() {
        LoggerUtil.log("-------------------------");
        LoggerUtil.log("Arrays fill() Method Demo");
        LoggerUtil.log("-------------------------");
        String[] values = new String[5];
        /* End Range is Non-Inclusive */
        Arrays.fill(values, 2, 4, "aaa");
        LoggerUtil.log(Arrays.toString(values));
    }
}
