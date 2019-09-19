package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")){
            ReadThread thread = new ReadThread(s);
            thread.start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        String fileName;
        public ArrayList<Integer> jj = new ArrayList<>();
        @Override
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(fileName);
                byte x [] = new byte[fis.available()];
                fis.read(x);
                for (int  i = 0; i< x.length;i++){
                    jj.add((int)x[i]);
                }
                int  obj = 0;
                for (int i : jj){
                    if (Collections.frequency(jj,obj) < Collections.frequency(jj,i)){
                        obj = i;
                        resultMap.put(fileName,obj);
                    }
                }
                fis.close();
            } catch (IOException e) {
                System.out.println("ошибка в чтении файла");
            }

        }

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
    }
}
