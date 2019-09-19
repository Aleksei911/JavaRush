package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static {
        labels.put(2.3, "hsdfg");
        labels.put(8.3, "shav");
        labels.put(1.8, "sagd");
        labels.put(5.4, "sakvdas");
        labels.put(7.6, "asgdfsadf");
    }
}
