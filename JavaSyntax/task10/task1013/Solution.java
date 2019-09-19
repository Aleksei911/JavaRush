package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private int age;
        private boolean sex;
        private String address;
        private String hobby;

        public Human(){
            this.name = "Noname";
        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }
        public Human(String name, String lastName, int age){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
        public Human (String name, String lastName, int age, boolean sex){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, String lastName, int age, boolean sex, String address){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }
        public Human(String name, String lastName, int age, boolean sex, String address, String hobby){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.hobby = hobby;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, String lastName, String hobby){
            this.name = name;
            this.lastName = lastName;
            this.hobby = hobby;
        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
    }
}
