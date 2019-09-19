package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] s = new int[20];
        int[] min1 = new int[10];
        int[] min2 = new int[10];
        for (int i = 0; i<s.length; i++){
            s[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i<10; i++){
            min1[i] = s[i];
        }
        for (int i = 10; i<20; i++){
            min2[i-10] = s[i];
        }
        for (int i = 10; i<20; i++){
            System.out.println(min2[i-10]);
        }

    }
}
