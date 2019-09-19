package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int positiv = 0;
        int negativ = 0;
        if (a>0) positiv++;
        if (b>0) positiv++;
        if (c>0) positiv++;

        if (a<0) negativ++;
        if (b<0) negativ++;
        if (c<0) negativ++;

        System.out.println("количество отрицательных чисел: " + negativ + ", " + "количество положительных чисел: " + positiv);
    }
}
