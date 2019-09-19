package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> s = new ArrayList<String>();
        do {
            s.add(reader.readLine());
        }
        while (!s.contains("end"));
        if (s.contains("end")){
            s.remove("end");
        }
        for (int i=0; i<s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}