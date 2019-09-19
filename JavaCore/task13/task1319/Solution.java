package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        File file = new File(path);
        FileWriter writer = new FileWriter(file);
        BufferedWriter buffWriter = new BufferedWriter(writer);

        String line = "";
        while (!line.equals("exit")) {
            line = reader.readLine();
            buffWriter.write(line);
            buffWriter.newLine();
        }

        buffWriter.flush();
        buffWriter.close();
    }
}
