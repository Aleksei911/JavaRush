package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year1 = reader.readLine();
        String mouns1 = reader.readLine();
        String day1 = reader.readLine();
        int day = Integer.parseInt(day1);
        int mounth = Integer.parseInt(mouns1);
        int year = Integer.parseInt(year1);
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + mounth + "." + year);

    }
}
