package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        String id = args[0];
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String s;
        while ((s = reader.readLine()) != null) {
            String[] info = s.split(" ");
            if (info[0].equals(id)) {
                System.out.println(String.format("%s %s %s %s", info[0], info[1], info[2], info[3]));
                break;
            }
        }
        reader.close();
    }
}
