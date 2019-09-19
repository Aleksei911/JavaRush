package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;

    public Hippodrome(List list){
        this.horses = list;
    }

    private static List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses(){
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();
    }

    public void print(){
        for (Horse horse : getHorses()) {
            horse.print();}
        for(int i = 0; i <= 10; i++){
            System.out.println();}
    }

    public Horse getWinner(){
        if (horses.get(0).getDistance() > horses.get(1).getDistance() && horses.get(0).getDistance() > horses.get(2).getDistance()){
            return Hippodrome.horses.get(0);
        }
        else if (horses.get(1).getDistance() > horses.get(0).getDistance() && horses.get(1).getDistance() > horses.get(2).getDistance()){
            return horses.get(1);
        }
        else return horses.get(2);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(horses);

        Horse murka = new Horse("Murka", 3, 0);
        Horse juchka = new Horse("Juchka", 3, 0);
        Horse burka = new Horse("Burka", 3, 0);

        horses.add(murka);
        horses.add(juchka);
        horses.add(burka);

        game.run();

        game.getWinner();
        game.printWinner();
    }
}
