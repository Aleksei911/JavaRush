package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = reader.readLine();
        String nameFile2 = reader.readLine();
        reader.close();

        //читаем из первого файла в массив байтов;
        InputStream inputFromFile1 = new FileInputStream(nameFile1);
        byte[] buffer1 = new byte[inputFromFile1.available()];
        inputFromFile1.read(buffer1);
        inputFromFile1.close();

        OutputStream outputToFile1 = new FileOutputStream(nameFile1);
        InputStream inputFile2 = new FileInputStream(nameFile2);
        byte[] buffer2 = new byte[inputFile2.available()];
        inputFile2.read(buffer2);
        inputFile2.close();
        outputToFile1.write(buffer2);
        outputToFile1.write(buffer1);
        outputToFile1.close();
    }
}
