package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> s = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        for (int i = 0; i<20; i++){
            s.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i<s.size(); i++){
            int x = s.get(i);
            if (x % 3==0 && x % 2 ==0){
                    one.add(x);
                    two.add(x);
            }
            else if (x%3==0){
                one.add(x);
            }
            else if (x%2==0){
                two.add(x);
            }
            else if (x%3!=0 && x%2!=0){
                three.add(x);
            }
        }
        printList(one);
        printList(two);
        printList(three);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i:list) {
            System.out.println(i);
        }
    }
}
