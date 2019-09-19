package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("isugivgaerioghieor");
        arr.add("ksjfhihrivh");
        arr.add("hsbdvsadvgsgdsuhvis");
        arr.add("hbvnbcxnvb");
        ArrayList<String>[] arrMas = new ArrayList[1];
        for (int i=0; i<arrMas.length; i++){
            arrMas[i] = arr;
        }
        return arrMas;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}