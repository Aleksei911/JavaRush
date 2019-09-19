package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String n = reader.readLine();
            if (n.isEmpty()) {
                break;
            }

            int num = Integer.parseInt(n);

            String str = reader.readLine();
            map.put(str, num);
            if (str.equals("")) {
                break;
            }
        }

        for (HashMap.Entry x : map.entrySet()) {
            System.out.println(x.getValue() + " " + x.getKey());
        }
    }
}
