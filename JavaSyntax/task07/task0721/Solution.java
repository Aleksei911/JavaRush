package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        for (int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }

        int maximum=a[0];
        int minimum=a[0];

        for (int i =1; i<a.length; i++){
            if (a[i]>maximum){
                maximum=a[i];
            }
            if (a[i]<=minimum){
                minimum=a[i];
            }
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
