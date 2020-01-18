package com.javarush.task.task31;

public class Kata {
    public static void main(String[] args) {
        System.out.println(method1());
        System.out.println(method2());
    }

    public static String method1() {
        String s = "Some text";
        int count = 100;
        for (int i = 0; i < count; i++) s += i;
        return s;
    }

    public static StringBuilder method2() {
        StringBuilder s = new StringBuilder(110);
        int count = 100;
        s.append("Some text");
        for (int i = 0; i < count; i++) s.append(i);
        return s;
    }

}