package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (file1.ready()){
            String data = file1.readLine();
            StringBuilder stringBuilder = new StringBuilder(data);
            stringBuilder.reverse();
            System.out.println(stringBuilder);
        }
        file1.close();
    }
}
