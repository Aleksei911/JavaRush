package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        String line;

        while ((line = br.readLine()) != null) {
            StringBuilder toFile2 = new StringBuilder();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].matches(".*\\d+.*")) {
                    toFile2.append(words[i] + " ");
                }
            }
            bw.write(toFile2.toString());
        }

        br.close();
        bw.close();
    }
}
