package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg n1 = new Zerg();
        n1.name = "Oleg";
        Zerg n2 = new Zerg();
        n2.name = "Alex";
        Zerg n3 = new Zerg();
        n3.name = "Sergei";
        Zerg n4 = new Zerg();
        n4.name = "Dima";
        Zerg n5 = new Zerg();
        n5.name = "Vika";
        Protoss p1 = new Protoss();
        p1.name = "Anna";
        Protoss p2 = new Protoss();
        p2.name = "Valentina";
        Protoss p3 = new Protoss();
        p3.name = "Evgenij";
        Terran t1 = new Terran();
        t1.name = "Egor";
        Terran t2 = new Terran();
        t2.name = "Misha";
        Terran t3 = new Terran();
        t3.name = "Gena";
        Terran t4 = new Terran();
        t4.name = "Lena";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
