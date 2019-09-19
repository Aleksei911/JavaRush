package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> s = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            s.add(Integer.parseInt(reader.readLine()));
        }
        int max = 1;
        int count = 1;
        for (int i =0; i<9; i++){
            if (s.get(i).equals(s.get(i+1))){
                count++;
                if (count>max){
                    max = count;
                }
            }
            else count=1;
        }
        System.out.println(max);

    }
}