package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные
из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "file.txt";

        int [] arr = {5,8,-2,11,3,-5,2,10};
//        int [arr.length] arrSort;
//        int[] arrr = new int arrr[7];

        try {
            fileName = bf.readLine();
            FileInputStream fIn = new FileInputStream(fileName);
            //String num = new FileInputStream();
            //System.out.println(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) System.out.println(arr[i]);
        }
    }
}
