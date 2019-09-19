package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<String>();
        for (int i=0; i<10; i++){
            s.add(i, reader.readLine());
        }
        int max=s.get(0).length();
        int min=s.get(0).length();
        int countMax = 0;
        int countMin = 0;
        String maximum = s.get(0);
        String minimum = s.get(0);
        for (int i=1; i<10; i++){
            if (s.get(i).length()>max){
                max = s.get(i).length();
                maximum = s.get(i);
                countMax = i;
            }
        }
        for (int i=1; i<10; i++){
            if (s.get(i).length()<min){
                min = s.get(i).length();
                minimum = s.get(i);
                countMin = i;
            }
        }
        if (countMax<countMin){
            System.out.println(maximum);
        }
        if (countMin<countMax){
            System.out.println(minimum);
        }

    }
}
