package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        String bb = reader.readLine();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        if (a<b || a==b)
            System.out.println(a);
        else System.out.println(b);

    }
}