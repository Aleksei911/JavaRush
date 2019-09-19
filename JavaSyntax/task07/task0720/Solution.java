package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> s = new ArrayList<String>();

        for (int i=0; i<N; i++){
            s.add(i, reader.readLine());
        }
        for (int i=0; i<M; i++){
            s.add(s.get(0));
            s.remove(0);
        }
        for (int i=0; i<s.size(); i++){
            System.out.println(s.get(i));
        }


        //напишите тут ваш код
    }
}
