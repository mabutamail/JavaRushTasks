package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так,
чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один).
Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();
        FileInputStream fis2 = new FileInputStream(f2);
        FileInputStream fis1 = new FileInputStream(f1);
        ArrayList<Integer> list = new ArrayList<>();

        while (fis2.available() > 0) {
            list.add(fis2.read());
        }

        while (fis1.available() > 0) {
            list.add(fis1.read());
        }

        FileOutputStream fos = new FileOutputStream(f1);

        for (int x : list) {
            fos.write(x);
        }

        fis1.close();
        fis2.close();
        fos.close();
    }
}
