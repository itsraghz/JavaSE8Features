package com.raghsonline.javase.v8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    private static List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    private static Stream<Integer> numberStream, newNumberStream;

    public static void main(String[] args) {
        streamsDemo();
    }

    public static void streamsDemo() {
        createStreamsDemo();
        streamIntermediateMethodsDemo();
        streamTerminalMethodsDemo();
    }

    //////////////////////////////////////////////////////////////////////////////
    //                  Streams Create Operations
    //////////////////////////////////////////////////////////////////////////////

    private static void createStreamsDemo() {
        createStreams1OnCollection();
        createStreams2OnStream();
    }

    private static void createStreams2OnStream() {
        newNumberStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("newNumberStream : " + newNumberStream);
        printStream(newNumberStream);
    }

    private static void createStreams1OnCollection() {
        numberStream = numbersList.stream();
        System.out.println("numberList : " + numbersList);
        System.out.println("numberStream : " + numberStream);
        printStream(numberStream);
    }

    private static void printStream(Stream<Integer> numberStream) {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Stream toString() --> " + numberStream.toString());
        //numberStream.forEach(System.out::print);
        numberStream.forEach(p -> System.out.print(p+ " "));
        System.out.println();
        System.out.println("-------------------------");
    }

    //////////////////////////////////////////////////////////////////////////////
    //                  Streams Intermediate Operations
    //////////////////////////////////////////////////////////////////////////////

    private static void streamIntermediateMethodsDemo() {
        streamIntermediateMethod1MapDemo();
        streamIntermediateMethod2FilterDemo();
        streamIntermediateMethod3SortedDemo();
        streamIntermediateMethod4FlatMapDemo();
        streamIntermediateMethod5DistinctDemo();
        streamIntermediateMethod6PeekDemo();
    }

    /**
     * <p>
     *     The <tt>map()</tt> method is used to perform an operation over each individual element of a Collection.
     * </p>
     */
    private static void streamIntermediateMethod1MapDemo() {
        // Needed, as the Stream has been closed earlier for a Print Operation (Terminal Operation).
        // Otherwise, the JVM will throw an exception
        //    java.lang.IllegalStateException: stream has already been operated upon or closed
        numberStream = numbersList.stream();
        List<Integer> squaredNumbersList = numberStream.map(x -> x * x).collect(Collectors.toList());
        System.out.println("squaredNumbersList :: " + squaredNumbersList);
    }

    /**
     * <p>
     *     The <tt>filter()</tt> method used to filter out the results as per our conditions.
     * </p>
     * <p>
     *     Now lets consider we want to filter out even numbers from the list of numbers from 1 to 10.
     * </p>
     */
    private static void streamIntermediateMethod2FilterDemo() {
        numberStream = numbersList.stream();
        List<Integer> evenNumbersList = numberStream.filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbersList :: " + evenNumbersList);
    }

    /**
     * <p>
     *     if you wish to sort the given collection, Streams at your service!!
     * </p>
     * <p>
     *     You can use the <tt>sorted()</tt> method as an intermediate function for the sorting.
     * </p>
     */
    private static void streamIntermediateMethod3SortedDemo() {
        List<Integer> numberList = Arrays.asList(6,7,8,1,4,5,3,2,9,10);
        List<Integer> sortedList = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList :: " + sortedList);
    }

    /**
     * <p>
     *     flatMap() is used to convert 2 levels of stream into 1 level of stream.
     * </p>
     * <p>
     *     In simple words if we have a collection of arrayList which consists of arrayList,
     *     then with the help of <tt>flatMap()</tt> we can convert them into a single ArrayList.
     * </p>
     */
    private static void streamIntermediateMethod4FlatMapDemo() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> listOfNumberLists = Arrays.asList(list1, list2, list3);
        List<Integer> listOfAllIntegers = listOfNumberLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println("flatMap listOfAllIntegers :: " + listOfAllIntegers);
    }

    /**
     * <p>
     *     If the given collection has duplicate items,
     *     we can use the <tt>distinct()</tt> method to remove the duplicate items
     *     and have a filtered collection.
     * </p>
     */
    private static void streamIntermediateMethod5DistinctDemo() {
        List<Integer> numbersList = Arrays.asList(1, 4, 5, 1, 2, 3, 6, 4);
        List<Integer> distinctNumberList = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctNumberList :: " + distinctNumberList);
        List<Integer> distinctNumberSortedList = numbersList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("distinctNumberSortedList :: " + distinctNumberSortedList);
    }

    /**
     * <p>
     *     The <tt>peek()</tt> is an intermediate action, that returns a stream consisting of the elements of the
     *     traversed stream, additionally performing the provided action on each element as elements are
     *     consumed from the resulting stream.
     * </p>
     * <p>
     *     <b>Note: </b> The <tt>peek()</tt> operation does nothing if we do not specify a terminal operation.
     * </p>
     */
    private static void streamIntermediateMethod6PeekDemo() {
        List<Integer> evenNumbersList = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .peek(e -> System.out.println("The even number is : " + e))
                .collect(Collectors.toList());

        System.out.println("Even Numbers List contains : " + evenNumbersList);
    }

    //////////////////////////////////////////////////////////////////////////////
    //                  Streams Terminal Operations
    //////////////////////////////////////////////////////////////////////////////

    private static void streamTerminalMethodsDemo() {
        streamTerminalMethod1CollectDemo();
        streamTerminalMethod2CountDemo();
        streamTerminalMethod3AllMatchDemo();
        streamTerminalMethod4AnyMatchDemo();
        streamTerminalMethod5ForEachDemo();
    }

    /**
     * <p>
     *     The <tt>collect()</tt> operation helps to collect the stream into a collection.
     * </p>
     * <p>
     *     This method takes a Collector implementation that provides useful reduction operations
     * </p>
     */
    private static void streamTerminalMethod1CollectDemo() {
        List<String> listOfNames = Arrays.asList("Raghavan", "Kannan", "Raja", "Saravanan", "Ravi");
        List<String> namesWithRList = listOfNames.stream().filter(x -> x.startsWith("R")).collect(Collectors.toList());
        System.out.println("namesWithRList :: " + namesWithRList);

        listOfNames.stream().filter(x -> x.startsWith("K")).mapToInt(x -> x.length()).forEach(System.out::println);
    }

    /**
     * <p>
     *     The <tt>count()</tt> terminal operation helps us to find the count of the processed collection.
     * </p>
     */
    private static void streamTerminalMethod2CountDemo() {
        List<String> listOfNames = Arrays.asList("Raghavan", "Kannan", "Raja", "Saravanan", "Ravi");
        long count = listOfNames.stream().filter(x -> x.startsWith("R")).count();

        System.out.println("namesWithRList count :: " + count);
    }

    /**
     * <p>
     *     The <tt>allMatch()</tt> operation helps us to get the answer:
     *     <b>Do all the elements of the stream match the condition?</b>
     * </p>
     */
    private static void streamTerminalMethod3AllMatchDemo() {
        List<String> listOfNames = Arrays.asList("Raghavan", "Kannan", "Raja", "Saravanan", "Ravi");
        boolean areAllNamesStartWithR  = listOfNames.stream().allMatch(x -> x.startsWith("R"));

        System.out.println("namesWithRList areAllNamesStartWithR :: " + areAllNamesStartWithR);
    }

    /**
     * <p>
     *     As compared to the <tt>allMatch()</tt>, the <tt>anyMatch()</tt> helps to check
     *     if either one of the elements in the stream matched the condition.
     * </p>
     */
    private static void streamTerminalMethod4AnyMatchDemo() {
        List<String> listOfNames = Arrays.asList("Raghavan", "Kannan", "Raja", "Saravanan", "Ravi");
        System.out.println("listOfNames : " + listOfNames);
        boolean areAnyNamesStartWithR  = listOfNames.stream().anyMatch(x -> x.startsWith("R"));

        System.out.println("namesWithRList areAnyNamesStartWithR :: " + areAnyNamesStartWithR);

        boolean areAnyNamesStartWithJ  = listOfNames.stream().anyMatch(x -> x.startsWith("J"));

        System.out.println("namesWithRList areAnyNamesStartWithJ :: " + areAnyNamesStartWithJ);
    }

    /**
     * <p>
     *     The <tt>forEach()</tt> method is used to iterate over the resultant collection,
     *     same as that of the traditional for loop.
     * </p>
     */
    private static void streamTerminalMethod5ForEachDemo() {
        List<String> listOfNames = Arrays.asList("Raghavan", "Kannan", "Raja", "Saravanan", "Ravi");
        listOfNames.stream().filter(x -> x.startsWith("R")).forEach(System.out::println);
    }
}
