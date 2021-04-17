package com.raghsonline.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        testReflection();
    }

    private static void testReflection() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz = Class.forName("java.lang.StringBuilder");
        printClassInfo(clazz);
        Method method = clazz.getMethod("reverse");
        printMethodInfo(method);
    }
    
    private static void printClassInfo(Class clazz) {
        LoggerUtil.log("==================================");
        LoggerUtil.log("    CLASS Level Details ");
        LoggerUtil.log("==================================");
        LoggerUtil.log("Class :: " + clazz);
        int modifiers = clazz.getModifiers();
        LoggerUtil.log("class.getModifiers()        : " + modifiers);
        LoggerUtil.log("Modifiers.toString()        : " + Modifier.toString(modifiers));
        LoggerUtil.log("Modifier.classModifiers()   : " + Modifier.classModifiers());
        LoggerUtil.log("");
    }

    private static void printMethodInfo(Method method) {
        LoggerUtil.log("==================================");
        LoggerUtil.log("    Method Level Details ");
        LoggerUtil.log("==================================");
        LoggerUtil.log("Method          : " + method);
        LoggerUtil.log("Name            : " + method.getName());
        LoggerUtil.log("toString        : " + method.toString());
        LoggerUtil.log("toGenericString : " + method.toGenericString());
        LoggerUtil.log("Modifiers       : " + method.getModifiers());
        LoggerUtil.log("Modifiers.toString() : " + Modifier.toString(method.getModifiers()));
        LoggerUtil.log("Return Type     : " + method.getReturnType());
        LoggerUtil.log("Exception Type  : " + Arrays.toString(method.getExceptionTypes()));
        LoggerUtil.log("Annotations     : " + Arrays.toString(method.getAnnotations()));
        LoggerUtil.log("");
    }
}
