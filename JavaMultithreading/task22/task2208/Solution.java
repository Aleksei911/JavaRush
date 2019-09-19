package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {
        String format = "%s = '%s'", result = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry x : params.entrySet()) {
            if (x.getValue() != null) {
                if (stringBuilder.length() > 1) stringBuilder.append(" and ");
                stringBuilder.append(String.format(format, x.getKey(), x.getValue()));
            }
        }
        return stringBuilder.toString().trim();
    }
}
