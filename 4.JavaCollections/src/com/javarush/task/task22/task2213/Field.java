package com.javarush.task.task22.task2213;

public class Field {
    private int width, height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[this.height][this.width];
    }

    void print() {}
    void removeFullLines() {}
    Integer getValue(int x, int y){
        return (Integer) null;
     }
    void setValue(int x, int y, int value){}


}