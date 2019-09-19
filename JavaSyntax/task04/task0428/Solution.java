package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        if (a>0 && b<=0 && c<=0)
            System.out.println(1);
        else if (a<=0 && b>0 && c<=0)
            System.out.println(1);
        else if (a<=0 && b<=0 && c>0)
            System.out.println(1);
        else if (a>0 && b>0 && c<=0)
            System.out.println(2);
        else if (a>0 && b<=0 && c>0)
            System.out.println(2);
        else if (a<=0 && b>0 && c>0)
            System.out.println(2);
        else if (a>0 && b>0 && c>0)
            System.out.println(3);
        else System.out.println(0);

    }
}
