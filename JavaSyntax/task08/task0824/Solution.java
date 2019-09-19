package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {

    public static void main(String[] args) {

        Human child1 = new Human("Lara",false,10);
        Human child2 = new Human("Natasha",false,10);
        Human child3 = new Human("Ivan",true,10);

        Human mother = new Human("Lena", false, 26, child1,child2,child3);
        Human father = new Human("Masha", true, 25, child1,child2,child3);

        Human grandMa1 = new Human("Sveta", false, 35, father);
        Human grandPa1 = new Human("Boris", true, 36, mother);
        Human grandMa = new Human("Irina", false, 55, father);
        Human grandPa = new Human("Roman", true, 56, mother);

        ArrayList<Human> children = new ArrayList<Human>(Arrays.asList(child1,child2,child3,mother,father,grandMa1,grandPa1,grandMa,grandPa));
        for (Human h : children) {
            System.out.println(h);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human ...children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(children));
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }


        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
