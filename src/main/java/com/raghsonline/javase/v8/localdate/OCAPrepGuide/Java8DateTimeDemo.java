package com.raghsonline.javase.v8.localdate.OCAPrepGuide;

import com.raghsonline.util.LoggerUtil;

import java.time.*;


public class Java8DateTimeDemo {
    public static void main(String[] args) {
        demoDateTimeValues();
        demoSpecificDateTime();
        //demoCompilerErrorForConstructor();
        demoDateTimeException();
        dateManipulationMethodDemo();
    }

    private static void demoDateTimeValues() {
        LoggerUtil.log("localDate       : " + LocalDate.now());
        LoggerUtil.log("localTime       : " + LocalTime.now());
        LoggerUtil.log("localDateTime   : " + LocalDateTime.now());
        LoggerUtil.log("zonedDateTime   : " + ZonedDateTime.now());
    }

    /**
     OUTPUT
     -------
     "C:\Users\Raghavan Muthu\Downloads\jdk-14.0.2_windows-x64_bin\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\lib\idea_rt.jar=51950:C:\Users\Raghavan Muthu\Downloads\ideaIU-2020.2.1.win\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Raghavan Muthu\OneDrive\Documents\prfsnl\JavaSE8Features\target\classes" com.raghsonline.javase.v8.localdate.OCAPrepGuide.Java8DateTimeDemo
     localDate       : 2021-04-19
     localTime       : 20:29:58.418141300
     localDateTime   : 2021-04-19T20:29:58.418141300
     zonedDateTime   : 2021-04-19T20:29:58.418141300+05:30[Asia/Calcutta]

     Process finished with exit code 0

     */

    private static void demoSpecificDateTime() {
        LoggerUtil.log("(specific) localDate       : " + LocalDate.of(1981, 5, 30));
        LoggerUtil.log("(specific) localDate       : " + LocalDate.of(1981, Month.MAY, 30));
        LoggerUtil.log("(specific) localTime       : " + LocalTime.of(6, 24));
        LoggerUtil.log("(specific) localTime       : " + LocalTime.of(6, 24, 12));
        LoggerUtil.log("(specific) localTime       : " + LocalTime.of(6, 24, 12, 360));
        LoggerUtil.log("(specific) localDateTime   : " + LocalDateTime.of(2012, Month.AUGUST, 20, 06, 24,12));
        LoggerUtil.log("(specific) zonedDateTime   : " + ZonedDateTime.of(LocalDateTime.of(2012, Month.AUGUST, 20, 06,24, 12, 30), ZoneId.systemDefault()));
    }

    private static void demoDateTimeException() {
        LocalDate invalidLocalDate = null;

        try {
            invalidLocalDate = LocalDate.of(2015, Month.JANUARY, 32);
            LoggerUtil.log("invalidLocalDate   : " + invalidLocalDate.now());
        } catch (DateTimeException dte) {
            LoggerUtil.log("Exception occurred while creating a specific date and time");
            LoggerUtil.log("Exception Message is :: " + dte.getMessage());
            dte.printStackTrace();
        }

        /**
         OUTPUT
         ------
         Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32
         at java.base/java.time.temporal.ValueRange.checkValidValue(ValueRange.java:312)
         at java.base/java.time.temporal.ChronoField.checkValidValue(ChronoField.java:717)
         at java.base/java.time.LocalDate.of(LocalDate.java:251)
         at com.raghsonline.javase.v8.localdate.OCAPrepGuide.Java8DateTimeDemo.demoDateTimeException(Java8DateTimeDemo.java:16)
         at com.raghsonline.javase.v8.localdate.OCAPrepGuide.Java8DateTimeDemo.main(Java8DateTimeDemo.java:12)

         Process finished with exit code 1
         */
    }

    private static void demoCompilerErrorForConstructor() {
        /* Message: 'LocalDateTime(java.time.LocalDate, java.time.LocalTime)'
            has private access in 'java.time.LocalDateTime' */
        //LocalDate localDate = new LocalDateTime();
    }

    private static void dateManipulationMethodDemo() {
        LocalDate localDate = LocalDate.now();
        LoggerUtil.log("localDate :: " + localDate);
        localDate.plusDays(1);
        LoggerUtil.log("localDate +1 days (unassigned ref) :: "+ localDate);
        localDate = localDate.plusDays(1);
        LoggerUtil.log("localDate +1 days (assigned ref - immutable) :: "+ localDate);
    }
}
