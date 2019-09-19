package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("vol1", 368);
        map.put("vol2", 568);
        map.put("vol3", 687);
        map.put("vol4", 798);
        map.put("vol5", 135);
        map.put("vol6", 852);
        map.put("vol7", 279);
        map.put("vol8", 485);
        map.put("vol9", 561);
        map.put("vol10", 399);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if(value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}