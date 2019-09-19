package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] m1 = Thread.currentThread().getStackTrace();
        return m1[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] m2 = Thread.currentThread().getStackTrace();
        return m2[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] m3 = Thread.currentThread().getStackTrace();
        return m3[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] m4 = Thread.currentThread().getStackTrace();
        return m4[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] m5 = Thread.currentThread().getStackTrace();
        return m5[2].getMethodName();
    }
}
