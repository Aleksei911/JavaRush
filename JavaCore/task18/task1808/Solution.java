package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[file1.available()];
        int count = buffer.length;
        int halfLength = count / 2;

        while (file1.available() > 0){
            file1.read(buffer);
        }


        if (count % 2 == 0) {
            file2.write(buffer, 0, halfLength);
            file3.write(buffer, halfLength, halfLength);
        } else {
            file2.write(buffer, 0, halfLength + 1);
            file3.write(buffer, halfLength + 1, halfLength);
        }
        file1.close();
        file2.close();
        file3.close();
    }
}
