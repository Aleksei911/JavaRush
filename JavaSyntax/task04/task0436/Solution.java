package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int m = Integer.parseInt (reader.readLine());
        int n = Integer.parseInt (reader.readLine());
        for (int q=0; q<m; q++) {
            for (int w=0; w<n; w++) {
                System.out.print (8);
            }
            System.out.println ();
        }



    }
}
