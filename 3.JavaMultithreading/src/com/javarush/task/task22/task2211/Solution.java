package com.javarush.task.task22.task2211;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/* 
Смена кодировки
В метод main первым параметром приходит имя файла,
тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла,
в который необходимо записать содержимое первого файла в кодировке UTF-8.


Требования:
1. Программа НЕ должна считывать данные с клавиатуры.
2. Программа НЕ должна выводить данные на экран.
3. Программа должна записывать данные в файл.
4. Содержимое второго файла должно соответствовать содержимому
первого файла за исключением кодировки(UTF-8).
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fr = new FileInputStream(args[0]);
             FileOutputStream fw = new FileOutputStream(args[1])
        ) {
            byte[] bufer = new byte[1000];
            Charset utf_8 = StandardCharsets.UTF_8;
            Charset windows1251 = Charset.forName("Windows-1251");

            while (fr.available() > 0) {
                fr.read(bufer);
                String s = new String(bufer, windows1251);
                bufer = s.getBytes(utf_8);
                fw.write(bufer);
            }
        } catch (IOException e) {
        }
    }
}