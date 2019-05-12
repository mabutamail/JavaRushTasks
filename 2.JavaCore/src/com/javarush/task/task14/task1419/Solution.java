package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions(){   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try { throw new Exception(); }
        catch (Exception e){
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new RuntimeException());
            exceptions.add(new NumberFormatException());
            exceptions.add(new StringIndexOutOfBoundsException());
            exceptions.add(new NullPointerException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new ClassCastException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new FileNotFoundException());
        }
    }
}
