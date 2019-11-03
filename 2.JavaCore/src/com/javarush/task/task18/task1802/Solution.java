package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream("F:\\Java\\Projects\\JavaRushTasks\\example\\src\\main\\resources\\FileInputStreamExample.txt");
       // FileInputStream inputStream = new FileInputStream(reader.readLine());
        //System.out.println(fis1);
        int i;
//        int min = Integer.MAX_VALUE;
//        if (inputStream.available() > 0) {
           int min = inputStream.read();
//        }
        while (inputStream.available() > 0)
            if ((i = inputStream.read()) < min)
                min = i;
        System.out.println(min);
        inputStream.close();

    }
}