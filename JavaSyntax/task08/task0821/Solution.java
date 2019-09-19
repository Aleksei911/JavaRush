package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Казак", "Дмитрий");
        map.put("Казак", "Юрий");
        map.put("Кохнюк", "Алексей");
        map.put("Кохнюк", "Валентина");
        map.put("Ленкевич", "Сергей");
        map.put("Бирюк", "Виктория");
        map.put("Есманович", "Сергей");
        map.put("муркиукр", "Дмит");
        map.put("оукти", "Дмитрий");
        map.put("утемкуеп", "Дмитрий");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
