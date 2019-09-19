package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int s = Integer.parseInt(a);
        if (s>0)
            System.out.println(s*2);
        else if (s<0)
            System.out.println(s+1);
        else System.out.println(s);

    }

}