package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.strength + this.weight+this.age > anotherCat.strength + anotherCat.weight + anotherCat.age)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
            cat1.age = 5;
            cat1.weight = 10;
            cat1.strength = 15;

        Cat cat2 = new Cat();
            cat2.age = 6;
            cat2.weight = 11;
            cat2.strength = 16;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));


    }
}
