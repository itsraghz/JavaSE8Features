package com.raghsonline.javase.basics.constructor.OCAPrepGuide;

class BaseClass {
    public BaseClass() {
        System.out.println("Base Class");
    }
}

class SubClass extends BaseClass {
    public SubClass() {
        System.out.println("Sub Class");
    }
}

class SubClass2 extends BaseClass {
    String message = "SubClass2";

    public SubClass2(String msg) {
        System.out.println("SubClass2 - One Arg constructor invoked with - " + msg);
    }
}

/**
 * <p>
 *     A class to test the the super class constructor being invoked, even when
 *     there is no explicit call to the parent class constructor via <tt>super()</tt>
 * </p>
 */
public class SuperMethodTest {
    public static void main(String[] args) {
        //SubClass sc = new SubClass();
        SubClass2 sc2 = new SubClass2("Test Message");
    }
}

/**
 Output
 =======
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=50013:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.basics.constructor.OCAPrepGuide.SuperMethodTest
 Base Class
 Sub Class

 Process finished with exit code 0
 */