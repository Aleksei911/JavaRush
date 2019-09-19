package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<String> listVal = new ArrayList<String>();
        listVal.add("January");
        listVal.add("February");
        listVal.add("March");
        listVal.add("April");
        listVal.add("May");
        listVal.add("June");
        listVal.add("July");
        listVal.add("August");
        listVal.add("September");
        listVal.add("October");
        listVal.add("November");
        listVal.add("December");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfMonth = reader.readLine();
        for (int i=0; i<listVal.size(); i++){
            if (nameOfMonth.equals(listVal.get(i))){
                System.out.println(nameOfMonth + " is the " + (i+1) + " month");
            }
        }
    }
}
