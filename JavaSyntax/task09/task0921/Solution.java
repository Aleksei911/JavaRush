package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> s = new ArrayList<Integer>();
        try {
            while (true){
                int a = Integer.parseInt(reader.readLine());
                s.add(a);
            }
        }
        catch (Exception e){
            for (int i =0; i<s.size(); i++){
                System.out.println(s.get(i));
            }
        }
    }
}
