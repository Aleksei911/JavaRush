package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=30; i<=0; i--){
            a.add(i);
        }
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
