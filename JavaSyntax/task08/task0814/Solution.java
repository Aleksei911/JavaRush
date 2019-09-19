package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> s = new HashSet<Integer>();
        for (int i=0; i<20; i++){
            s.add(i);
        }

        return s;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()){
            Integer text = integerIterator.next();
            if (text > 10){
                integerIterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
