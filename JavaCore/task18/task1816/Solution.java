package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            String filePath = args[0];
            int wovels = 0;
            FileInputStream inputStream = new FileInputStream(filePath);
            while(inputStream.available()>0){
                char i = (char) inputStream.read();
                if(((i>='A') && (i<='Z')) || ((i>='a') && (i<='z'))) {
                    wovels++;
                }
            }
            System.out.println(wovels);
            inputStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
