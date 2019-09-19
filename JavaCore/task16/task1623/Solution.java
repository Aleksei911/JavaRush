package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread(){
            super(Integer.toString(++createdThreadCount));
            start();
        }
        @Override
        public String toString() {
            return getName() + " created";
        }

        public void run(){
            if(createdThreadCount <= Solution.count){
                GenerateThread t = new GenerateThread();
                System.out.println(t);
            }
        }
    }
}
