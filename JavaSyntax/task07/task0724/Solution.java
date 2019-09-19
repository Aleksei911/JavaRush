package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human dedAlexan = new Human("Alexan", true, 80);
        Human babSveta = new Human("Sveta", false, 75);
        Human dedNikola = new Human("Nikola", true, 80);
        Human babTetyana = new Human("Tetyana", false, 75);

        Human fatherVictor = new Human("Viktor", true, 41, dedNikola, babTetyana);
        Human motherTetyana = new Human("Tetyana", false, 40, dedAlexan, babSveta);

        Human sonAlex = new Human("Alex", true, 15, fatherVictor, motherTetyana);
        Human sonTim = new Human("Tim", true, 10, fatherVictor, motherTetyana);
        Human sisterOla = new Human("Ola", false, 3, fatherVictor, motherTetyana);

        System.out.println(dedAlexan);
        System.out.println(babSveta);
        System.out.println(dedNikola);
        System.out.println(babTetyana);

        System.out.println(fatherVictor);
        System.out.println(motherTetyana);

        System.out.println(sonAlex);
        System.out.println(sonTim);
        System.out.println(sisterOla);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}