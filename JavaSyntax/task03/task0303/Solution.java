package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(26,0.897));
        System.out.println(convertEurToUsd(16,0.531));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur*course;

    }
}
