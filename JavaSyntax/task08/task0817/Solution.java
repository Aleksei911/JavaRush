package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Кохнюк", "Алексей");
        map.put("Казакr", "Дмитрий");
        map.put("Есмановичt", "Сергей");
        map.put("Есманович", "Вика");
        map.put("Казак", "Анна");
        map.put("Ленкевичw", "Сергей");
        map.put("Ленкевичe", "Дмитрий");
        map.put("Ленкевич", "Даша");
        map.put("Махало", "Даша");
        map.put("Тележевич", "Алексей");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> pair : map.entrySet()){
            if(Collections.frequency(map.values(), pair.getValue()) > 1){
                list.add(pair.getValue());
            }
        }

        for (String name : list) {
            removeItemFromMapByValue(map, name);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
