package com.javarush.task.task22.task2213;

public class Tetris {
    private Field field;
    private Figure figure;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    void run(){}
    void step(){}
    static Tetris game;

    public static void main(String[] args) {
       game = new Tetris();
       Tetris.game.run();
        
    }
}
