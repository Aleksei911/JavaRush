package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Character, Integer> tmci = new TreeMap<>();
        FileInputStream fis = new FileInputStream(args[0]);
        byte[] bytes = new  byte[fis.available()];
        fis.read(bytes);
        for (int i = 0; i < bytes.length; i++) {
            Character ch = Character.valueOf((char)bytes[i]);
            if(!tmci.containsKey((char)bytes[i])){
                tmci.put(ch,1);
            }else{
                tmci.replace(ch,tmci.get(ch)+1);
            }
        }
        for (Map.Entry<Character,Integer> pair: tmci.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        fis.close();
    }
}
