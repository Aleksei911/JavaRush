package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double a = Double.parseDouble(s);
        if (a>=0 && a<3 || a%5>=0 && a%5<3)
        System.out.println("зелёный");
        else if (a%5>=3 && a%5<4)
            System.out.println("желтый");
        else if (a%5>=4 && a%5<5)
            System.out.println("красный");

    }
}