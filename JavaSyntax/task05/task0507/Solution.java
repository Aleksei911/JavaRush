package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        double K=0,S=0;
        while (true){
            int  a=sc.nextInt();
            if (a==-1)
                break;
            S+=a;
            K++;
        }
        double P = S/K;
        System.out.println(P);

    }
}

