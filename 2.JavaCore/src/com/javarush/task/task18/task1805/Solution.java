package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла
в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream filereader = new FileInputStream // создаем и открываем поток, вводим название файла
            (new BufferedReader(new InputStreamReader(System.in)).readLine());
        Set<Integer> set = new TreeSet<Integer>(); // тут создаем самосортирующийся TreeSet

        while (filereader.available() > 0) { // записываем все байты в TreeSet он сам режет все повторы
            set.add(filereader.read());
        }
        filereader.close(); // закрываем поток, мы считали весь файл
        for (int i : set) { // и выводим наш TreeSet отсортированный через пробел в одну строку
            System.out.print(i + " ");
        }

    }
}
