package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int a = number/100;
        int b = (number%100)/10;
        int c = number%10;
        int summa = a+b+c;
        return summa;
    }
}