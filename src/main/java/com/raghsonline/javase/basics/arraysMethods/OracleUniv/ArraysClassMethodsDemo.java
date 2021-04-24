package com.raghsonline.javase.basics.arraysMethods.OracleUniv;

import com.raghsonline.util.LoggerUtil;

import java.util.*;

class LengthCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) return 1;
        if(o1.length() < o2.length()) return -1;
        return 0;
    }
}
public class ArraysClassMethodsDemo {

    public static void main(String[] args) {
        arraysFillMethodDemo();
        arraysEqualsMethodDemo();
        arraysSortDefaultComparatorDemo();
        arraysSortCustomComparatorDemo();
        arraysAsListOpsDemo();
    }

    private static void arraysAsListOpsDemo() {
        LoggerUtil.log("--------------------------");
        LoggerUtil.log("Arrays asList Method Demo");
        LoggerUtil.log("--------------------------");
        String[] arr = {"Tea","Cake"};
        List<String> texts = Arrays.asList(arr);
        LoggerUtil.log("Array :: " + arr);
        LoggerUtil.log("Array :: " + Arrays.toString(arr));
        LoggerUtil.log("Array as a List :: " + texts);

        //1. Add an element to the base Array
        /*arr[2] = "Coffee"; //java.lang.ArrayIndexOutOfBoundsException
        LoggerUtil.log("(Add) Array :: " + Arrays.toString(arr));
        LoggerUtil.log("(Add) Array as a List :: " + texts); */

        /**
         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
         at com.raghsonline.javase.basics.arraysMethods.OracleUniv.ArraysClassMethodsDemo.arraysAsListOpsDemo(ArraysClassMethodsDemo.java:37)
         at com.raghsonline.javase.basics.arraysMethods.OracleUniv.ArraysClassMethodsDemo.main(ArraysClassMethodsDemo.java:23)
         */

        //2. Add a new String to texts (list)
        /* texts.add("New"); //throws UnSupportedOperationException
        LoggerUtil.log("(Op1) Array as a List :: " + texts); */

        /**
         Exception in thread "main" java.lang.UnsupportedOperationException
         at java.base/java.util.AbstractList.add(AbstractList.java:153)
         at java.base/java.util.AbstractList.add(AbstractList.java:111)
         at com.raghsonline.javase.basics.arraysMethods.OracleUniv.ArraysClassMethosDemo.arraysAsListOpsDemo(ArraysClassMethodsDemo.java:37)
         at com.raghsonline.javase.basics.arraysMethods.OracleUniv.ArraysClassMethosDemo.main(ArraysClassMethodsDemo.java:23)
         */

        //3. Replace an element in the list
        // Ex. Replace 'Tea' with 'Coffee' in texts list
        texts.set(0, "Coffee");
        LoggerUtil.log("(Update to List) Array :: " + Arrays.toString(arr));
        LoggerUtil.log("(Update to List) Array as a List :: " + texts);

        //3. Replace an element in the array
        // Ex. Replace 'Tea' with 'Coffee' in texts list
        arr[0]="Coffee-New";
        LoggerUtil.log("(Update to Array) Array :: " + Arrays.toString(arr));
        LoggerUtil.log("(Update to Array) Array as a List :: " + texts);
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
