package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        int a = Integer.parseInt(aa);
        if (a<0 && a%2==0)
            System.out.println("отрицательное четное число");
        else if (a<0 && a%2!=0)
            System.out.println("отрицательное нечетное число");
        else if (a==0)
            System.out.println("ноль");
        else if (a>0 && a%2==0)
            System.out.println("положительное четное число");
        else if (a>0 && a%2!=0)
            System.out.println("положительное нечетное число");

    }
}
