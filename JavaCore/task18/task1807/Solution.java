package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        List<Integer> list = new ArrayList<>();

        while (fileInputStream.available()>0){
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        int zap = 0;
        for (int i = 0; i<list.size(); i++){
            if (list.get(i) == 44){
                zap++;
            }
        }
        System.out.println(zap);
    }
}
