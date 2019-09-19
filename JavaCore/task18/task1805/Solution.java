package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Set<Integer> set = new TreeSet<>();
        int readByte;
        while ((readByte=inputStream.read())>0){
            set.add(readByte);
        }

        for (Integer x : set ) {
            System.out.print(x+" ");

        }
        reader.close();
        inputStream.close();
    }
}
