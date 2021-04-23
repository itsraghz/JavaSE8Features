package com.raghsonline.javase.practiceQ.collections.OracleUniv;

import java.util.Arrays;

public class ArarysBinarySearch {
    public static void main(String[] args) {
        String[] names = {"Mary","Jane","Ann","Tom"};
        Arrays.sort(names);
        int x = Arrays.binarySearch(names,"Ann");
        System.out.println(x);
    }
}

/**
 OUTPUT
 -----
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=53597:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.practiceQ.collections.OracleUniv.ArarysBinarySearch
 0

 Process finished with exit code 0
 */
