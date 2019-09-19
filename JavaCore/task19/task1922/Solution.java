package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        BufferedReader bf = new BufferedReader(fileReader);
        String[] mass;
        while (bf.ready()){
            String ctr = bf.readLine();
            mass=ctr.split(" ");
            int count=0;
            for (int i=0; i<mass.length; i++) {
                for (int j = 0; j < words.size(); j++) {
                    if (mass[i].equals(words.get(j))) {
                        count++;
                    }
                }
            }
            if (count==2){
                System.out.println(ctr);
            }
        }
        fileReader.close();

    }
}
