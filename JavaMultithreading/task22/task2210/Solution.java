package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String [] s = getTokens("level 22.lesson 13.task 01", ".");
        for (String str : s) {
            System.out.print(str);
        }

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        ArrayList<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            list.add(tokenizer.nextToken());
        }
        String[] ss=new String[list.size()];
        for (int i=0;i<list.size();i++) {
            ss[i]=(list.get(i));
        }
        return ss;
    }
}
