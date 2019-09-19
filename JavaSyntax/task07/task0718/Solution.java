package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<String>();
        for (int i = 0; i<10; i++){
            s.add(reader.readLine());
        }
        for (int i = 1; i<s.size();){
            if (s.get(i).length()>s.get(i-1).length()){
                i++;
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

