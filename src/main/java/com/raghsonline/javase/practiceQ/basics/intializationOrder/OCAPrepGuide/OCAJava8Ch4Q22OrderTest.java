package com.raghsonline.javase.practiceQ.basics.intializationOrder.OCAPrepGuide;

class Order {
    static String result = "";

    { result += "c";}

    static { result += "u";}

    { result += "r";}
}

public class OCAJava8Ch4Q22OrderTest {
    public static void main(String[] args) {
        System.out.print(Order.result + " "); // "u "
        System.out.print(Order.result + " "); // "u " -> "u u "
        new Order(); //result -> "ucr"
        new Order(); //result -> "ucrcr"
        System.out.print(Order.result + " "); // "u u ucrcr"
    }
}


/**
 Output
 ------
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=63381:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.practiceQ.basics.OCAPrepGuide.OCAJava8Ch4Q24OrderTest
 u u ucrcr
 Process finished with exit code 0
 */