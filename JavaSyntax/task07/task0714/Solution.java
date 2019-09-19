package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<String>();
        for (int i=0; i<5; i++){
            s.add(i, reader.readLine());
        }
        s.remove(2);
        for (int i=3; i>=0; i--){
            System.out.println(s.get(i));
        }
    }
}
