package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int a=0;
        for (HashMap.Entry<String, String> pair: map.entrySet()){
            if (name.equals(pair.getValue())){
                a++;
            }
        }
        return a;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int a=0;
        for (HashMap.Entry<String, String> pair: map.entrySet()){
            if (lastName.equals(pair.getKey())){
                a++;
            }
        }
        return a;

    }

    public static void main(String[] args) {

    }
}
