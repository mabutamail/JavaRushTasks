package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> frequencyMap = new TreeMap<>();
        InputStream f = new FileInputStream(args[0]);

        while (f.available() > 0) {
            byte[] buf = new byte[f.available()];
           // f.read(buf);

            for (byte b : buf) {
                if (frequencyMap.containsKey(b))
                    frequencyMap.put(b, frequencyMap.get(b) + 1);
                else
                    frequencyMap.put(b, 1);
            }
        }
        f.close();

        for (Map.Entry pair : frequencyMap.entrySet()) {
            System.out.println((char) ((byte) pair.getKey()) + " " + pair.getValue());
        }
    }
}