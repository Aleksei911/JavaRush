package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String dd = reader.readLine();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);
        int d = Integer.parseInt(dd);
        if (a>=b && a>=c && a>=d)
            System.out.println(a);
        else if (b>=a && b>=c && b>=d)
            System.out.println(b);
        else if (c>=a && c>=b && c>=d)
            System.out.println(c);
        else System.out.println(d);

    }
}
