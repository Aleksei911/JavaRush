package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        boolean start =true;

        FileInputStream file = null;

        while (start) {

            try {
                str = reader.readLine();
                file = new FileInputStream(str);
                file.close();
            } catch (FileNotFoundException ex) {
                System.out.println(str);
                break;
            }

        }
    }
}
