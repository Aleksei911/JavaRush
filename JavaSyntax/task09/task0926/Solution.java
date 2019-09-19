package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] i1 = new int[]{12, 26, 32, 15, 8};
        int[] i2 = new int[]{23, 15};
        int[] i3 = new int[]{15, 2, 89, 7};
        int[] i4 = new int[]{25, 78, 12, 5, 9, 78, 6};
        int[] i5 = new int[]{};
        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(i1);
        arr.add(i2);
        arr.add(i3);
        arr.add(i4);
        arr.add(i5);
        return arr;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
