package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.


Требования:
1. Программа должна считывать c консоли имя файла.
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileName = new FileInputStream(reader.readLine());
2. Программа должна выводить на экран содержимое файла.
            while (fileName.available() > 0) {
                System.out.print((char) fileName.read());
            }
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
            fileName.close();
4. BufferedReader также должен быть закрыт.
            reader.close();
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream fileName = new FileInputStream(reader.readLine());
            while (fileName.available() > 0) {
                System.out.print((char) fileName.read());
            }
            System.out.println();
            fileName.close();

//            Stream                        интерфейс
//            InputStreamReader             класс
//            InputStream                   абстрактный класс
//                  FileInputStream
//            Reader                        абстрактный класс
//                  BufferedReader
//            FilterInputStream
//                  BufferedInputStream

        } catch (Exception e) {
            e.printStackTrace();
        }
        reader.close();
    }
}