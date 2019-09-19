package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1;
        int b = 1;
        while (b<=10){
            while (a<10){
                System.out.print(a*b + " ");
                a++;
            }
            System.out.println(a*b);
            b++;
            a=1;
        }

    }
}
