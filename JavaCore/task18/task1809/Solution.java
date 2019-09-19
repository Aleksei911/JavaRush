package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());

        List<Integer> list = new ArrayList<>();

        while (file1.available()>0){
            int coun = file1.read();
            list.add(coun);
        }
        Collections.reverse(list);

        for (int i = 0; i<list.size(); i++){
            file2.write(list.get(i));
        }

        file1.close();
        file2.close();
    }
}
