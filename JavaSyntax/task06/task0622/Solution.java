package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 5; i++) {
            if (a1 <= a2 && a1 <= a3 && a1 <= a4 && a1 <= a5) {
                System.out.println(a1);
                a1 = 2147483647;
            } else if (a2 <= a1 && a2 <= a3 && a2 <= a4 && a2 <= a5) {
                System.out.println(a2);
                a2 = 2147483647;
            } else if (a3 <= a1 && a3 <= a2 && a3 <= a4 && a3 <= a5) {
                System.out.println(a3);
                a3 = 2147483647;
            } else if (a4 <= a2 && a4 <= a3 && a4 <= a1 && a4 <= a5) {
                System.out.println(a4);
                a4 = 2147483647;
            } else if (a5 <= a2 && a5 <= a3 && a5 <= a4 && a5 <= a1) {
                System.out.println(a5);
                a5 = 2147483647;
            }
        }
    }
}


