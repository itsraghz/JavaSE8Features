package com.raghsonline.javase.practiceQ.collections.OracleUniv;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionsCustomSort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "Jane", "Elizabeth", "Jo"};
        Arrays.sort(names, new CollectionsCustomSort());
        for (String name : names) {
            System.out.println(name);
        }
    }
}

/**
  OUTPUT
  -------
 "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=53557:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.practiceQ.collections.OracleUniv.CollectionsCustomSort
 Elizabeth
 Mary
 Jane
 Jo

 Process finished with exit code 0
 */

