package com.raghsonline.javase.practiceQ.basics.intializationOrder.OCAPrepGuide;

public class OCAJava8Ch4Q23OrderTest {

    static class Order {
        String value = "t";

        { value += "a"; }
        { value += "c"; }

        public Order() {
            value += "b";
        }

        public Order(String s) {
            value += s;
        }
    }

    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order(); //Trick
        System.out.println(order.value);
    }
}

/**
 Output
 =======
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=63531:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.practiceQ.basics.intializationOrder.OCAPrepGuide.OCAJava8Ch4Q23OrderTest
 tacb

 Process finished with exit code 0
 */