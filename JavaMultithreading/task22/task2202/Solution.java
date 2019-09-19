package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null){
            throw new TooShortStringException();
        }
        String[] result = string.split(" ");
        if (result.length<5){
            throw new TooShortStringException();
        }
        if (result[1] == null ||result[2] == null || result[3] == null || result[4] == null  )
            throw new TooShortStringException();
        return new String(result[1] + " " + result[2] + " " + result[3] + " " + result[4] );

    }

    public static class TooShortStringException extends RuntimeException{
    }
}
