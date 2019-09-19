package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i=0; i<5; i++){
            strings.add(i, reader.readLine());
        }
        int max = strings.get(0).length();
        for (int i=1; i<5; i++){
            if (strings.get(i).length()>max){
                max = strings.get(i).length();
            }
        }
        for (int i=0; i<5; i++){
            if (strings.get(i).length()==max){
                System.out.println(strings.get(i));
            }
        }
    }
}
