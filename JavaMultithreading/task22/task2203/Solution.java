package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null){
            throw new TooShortStringException();
        }
        String[] result = string.split("\t");
        if (result.length<3){
            throw new TooShortStringException();
        }
        if (result[1] == null ||result[2] == null)
            throw new TooShortStringException();
        return new String(result[1]);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
