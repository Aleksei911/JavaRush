package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;

        String n = reader.readLine();
        int a = Integer.parseInt(n);
        if (a > 0) {
            for (int i = a; i > 0; i--) {
                String n1 = reader.readLine();
                int b = Integer.parseInt(n1);
                if (b > maximum)
                    maximum = b;

            }
        }
        else System.out.println("Неверно введено число");

        System.out.println(maximum);
    }
}
