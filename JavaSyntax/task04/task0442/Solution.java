package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int n=0;
        do {
            n=Integer.parseInt(bufferedReader.readLine());
            sum=sum+n;
        }while (n!=-1);
        System.out.println(sum);


    }
}
