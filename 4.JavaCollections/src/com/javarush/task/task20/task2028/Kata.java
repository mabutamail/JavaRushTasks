package com.javarush.task.task20.task2028;

public class Kata {
    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int i : n) sum += i * i;
        return sum;
    }
}