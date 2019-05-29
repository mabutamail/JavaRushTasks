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

import java.io.*;
import java.util.ArrayList;

import static java.util.Collections.sort;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        //File file = new File("D:\\Java\\Projects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1326\\file.txt");
        //BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        try {
            FileInputStream fileInputStream = new FileInputStream("file");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        arrayList.forEach(System.out::println);
        System.out.println("\n");

        sort(arrayList);

        for (Integer integer : arrayList) {
            if (integer % 2 == 0) System.out.println(integer);
        }
    }
}
