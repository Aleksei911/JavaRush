package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<String>();
        s.add("мама");
        s.add("мыла");
        s.add("раму");
        s.add(1, "именно");
        s.add(3, "именно");
        s.add(5, "именно");
        for (int i = 0; i<s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}
