package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        if (a>=b && a>=c && b>=c)
            System.out.println(a + " " + b + " " + c);
        else if (a>=b && a>=c && c>=b)
            System.out.println(a + " " + c + " " + b);
        else if (b>=a && b>=c && a>=c)
            System.out.println(b + " " + a + " " + c);
        else if (b>=a && b>=c && c>=a)
            System.out.println(b + " " + c + " " + a);
        else if (c>=a && c>=b && a>=b)
            System.out.println(c + " " + a + " " + b);
        else if (c>=a && c>=b && b>=a)
            System.out.println(c + " " + b + " " + a);


    }
}
