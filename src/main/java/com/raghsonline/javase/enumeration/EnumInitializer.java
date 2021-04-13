package com.raghsonline.javase.enumeration;

import com.raghsonline.util.LoggerUtil;

/**
 * <p>
 *     A class to test the initialization aspects of an `enum`.
 * </p>
 * <p>
 *     The first time that we ask for any of the enum values, Java constructs all of the enum
 *      values. After that, Java just returns the already‐constructed enum values.
 * </p>
 * @author raghs
 */
public class EnumInitializer {
    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE; // prints constructing
        OnlyOne secondCall = OnlyOne.ONCE; // doesn't print anything
        LoggerUtil.log("Instance firstCall of Enum OnlyOne :: " + firstCall);
        LoggerUtil.log("Instance secondCall of Enum OnlyOne :: " + secondCall);
    }
}

enum OnlyOne
{
    ONCE(true),
    TWICE(false);

    private OnlyOne(boolean b) {
        //Using LoggerUtil instead of SOP to escape from SonarLint comment
        LoggerUtil.log("constructing - " + this.name() + " with the boolean value : [" + b + "]");
    }
}

/**
 Output
 ------
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=58449:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.enumeration.EnumInitializer
 constructing - ONCE
 constructing - TWICE

 Process finished with exit code 0

 */

/**
 After incorporating the SonarLint Comments

 Output
 ------
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=58465:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.enumeration.EnumInitializer
 constructing - ONCE with the boolean value : [true]
 constructing - TWICE with the boolean value : [false]
 Instance firstCall of Enum OnlyOne :: ONCE
 Instance secondCall of Enum OnlyOne :: ONCE

 Process finished with exit code 0
 */