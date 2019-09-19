package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> hm = new TreeMap<>();
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        while (br.ready()) {
            String[] strings = br.readLine().split(" ");
            hm.put(strings[0], (hm.containsKey(strings[0]) ? hm.get(strings[0]) + Double.parseDouble(strings[1]) : Double.parseDouble(strings[1])));
        }

        fr.close();
        br.close();

        Iterator<Map.Entry<String, Double>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> pair = iterator.next();
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
