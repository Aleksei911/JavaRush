package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(new FileInputStream(file1));
        while (scanner.hasNext()) {
            String str = scanner.next();
            double digit = Double.parseDouble(str);
            if (digit > 0) {
                sb.append(Math.round(digit)).append(" ");
            } else {
                sb.append(Math.round(digit)).append(" ");
            }
        }

        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "utf-8"));
        String result = sb.toString();
        writer.write(result);

        writer.close();
        scanner.close();
        reader.close();
    }
}
