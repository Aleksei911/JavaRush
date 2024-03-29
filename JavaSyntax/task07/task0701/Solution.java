package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int[20];
                for (int i=0; i<array.length; i++){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String s = reader.readLine();
                    array[i] = Integer.parseInt(s);
                }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];

        for(int i : array){
            max = max < i ? i : max;
        }

        return max;
    }
}
