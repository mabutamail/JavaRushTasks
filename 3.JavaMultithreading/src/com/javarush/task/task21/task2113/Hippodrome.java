package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 Ипподром(16)
 Теперь уже точно все.

 Добавь вызов метода printWinner в конец метода main.

 Запускай и любуйся своей первой компьютерной игрой :)


 Требования:
 1. Метод printWinner должен быть вызван в методе main после метода run.
 */


public class Hippodrome {

    public static Hippodrome game;
    private List<Horse> horses = new ArrayList<>();

    public Hippodrome() {
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {

        for (Horse horses : horses) {
            horses.move();
        }
    }

    public void print() {
        for (Horse horses : horses) {
            horses.print();
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        Horse winner = null;

        for (Horse horses : horses) {
            if (horses.getDistance() > maxDistance) {
                maxDistance = horses.getDistance();
                winner = horses;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();

        game.getHorses().add(new Horse("papa", 3, 0));
        game.getHorses().add(new Horse("mama", 3, 0));
        game.getHorses().add(new Horse("grisha", 3, 0));

        Hippodrome.game.run();
        game.printWinner();

    }
}