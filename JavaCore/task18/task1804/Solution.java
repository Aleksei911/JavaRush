package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream reader = new FileInputStream(r.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        while (reader.available() > 0) {
            int b = reader.read();
            if(map.containsKey(b)){
                map.put(b, map.get(b) + 1);
            } else{
                map.put(b, 1);
            }
        }
        reader.close();

        int min = 100;
        for (int a : map.values()){
            if(a < min) min = a;
        }
        final int min_final = min;
        map.forEach((k, v) -> {
            if(v == min_final) System.out.print(k + " ");
        });
    }
}
