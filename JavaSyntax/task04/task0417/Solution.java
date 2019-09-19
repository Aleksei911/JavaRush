package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        String bb = reader.readLine();
        String cc = reader.readLine();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);
        if (a==b && a==c)
            System.out.println(a + " " + b + " " + c);
        else if (a==b)
            System.out.println(a + " " + b);
        else if (a==c)
            System.out.println(a + " " + c);
        else if (c==b)
            System.out.println(c + " " + b);

    }
}