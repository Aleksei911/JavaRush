package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<String>();
        for (int i = 0; i<5; i++){
            s.add(i, reader.readLine());
        }
        int min = s.get(0).length();
        for (int i=1; i<5; i++){
            if (s.get(i).length()<min){
                min = s.get(i).length();
            }
        }
        for (int i = 0; i<5; i++){
            if (min==s.get(i).length()){
                System.out.println(s.get(i));
            }
        }
    }
}
