package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("asg");
        list.add("asdgsad");
        list.add("vzbz");
        list.add("asgBSDfb");
        list.add("asgvdfv");
        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
