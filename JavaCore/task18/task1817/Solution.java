package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int space = 0;
        int symbol = 0;
        int i;
        while (fileInputStream.available()>0){
            i = fileInputStream.read();
            symbol++;
            if (i==32){
                space++;
            }
        }
        fileInputStream.close();
        double result = (double) space/symbol*100;
        System.out.printf("%.2f", result);
    }
}
