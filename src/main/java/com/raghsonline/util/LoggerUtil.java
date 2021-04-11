package com.raghsonline.util;

/**
 * <p>
 *     An Utility class to deal with the <tt>LoggerUtil.log()</tt>
 *     messages, to mitigate the <tt>Sonarlint</tt> observations.
 * </p>
 */
public class LoggerUtil {

    /**
     * <p>
     *     <b>SonarLint - CodeSmell</b>
     *     Utility classes should not have public constructors
     *          Code smell | Major | java:S1118
     * </p>
     */
    private LoggerUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static void log() {
        log("");
    }

    public static void log(String msg) {
        log(msg, true);
    }

    private static void log(String msg, boolean newLineReqd) {
        System.out.print(msg);

        if(newLineReqd) {
            System.out.println();
        }
    }
}
