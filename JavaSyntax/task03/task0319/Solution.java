package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String chislo1 = reader.readLine();
        String chislo2 = reader.readLine();
        System.out.println(name + " получает " + chislo1 + " через " + chislo2 + " лет.");

    }
}
