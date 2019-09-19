package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварцнеггер", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сигал", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Питт", dateFormat.parse("APRIL 1 2012"));
        map.put("Джоли", dateFormat.parse("JUNE 1 2012"));
        map.put("Уиллис", dateFormat.parse("MAY 1 2012"));
        map.put("Крюз", dateFormat.parse("JULY 1 2012"));
        map.put("Ван Дам", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Пачино", dateFormat.parse("JULY 1 2012"));
        map.put("Муди", dateFormat.parse("AUGUST 1 2012"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if(date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
