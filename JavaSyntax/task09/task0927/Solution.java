package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<String, Cat>();
        catMap.put("1", new Cat("1"));
        catMap.put("2", new Cat("2"));
        catMap.put("3", new Cat("3"));
        catMap.put("4", new Cat("4"));
        catMap.put("5", new Cat("5"));
        catMap.put("6", new Cat("6"));
        catMap.put("7", new Cat("7"));
        catMap.put("8", new Cat("8"));
        catMap.put("9", new Cat("9"));
        catMap.put("10", new Cat("10"));
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
