package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов

Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров
(Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать
ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14


Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert с параметром double в случае, если значение
параметра obj может быть корректно преобразовано в число типа double.
5. Программа должна вызывать метод alert с параметром String в случае, если значение
параметра obj НЕ может быть корректно преобразовано в число типа double.

*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        String str;
        String substr;
        String[] parametrs;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = reader.readLine();
            substr = str.substring(str.indexOf('?') + 1);
            parametrs = substr.split("&");
            for (String s: parametrs) {
                if(s.contains("=")) {
                    System.out.print(s.substring(0, s.indexOf('=')) + " ");
                } else {
                    System.out.print(s + " ");
                }
            }
            System.out.println();

            String subObj;
            for (String ss: parametrs) {
                if (ss.contains("obj=")) {
                    subObj = ss.substring(ss.indexOf('=') + 1);
                    try {
                        alert(Double.parseDouble(subObj));
                    } catch ( NumberFormatException e) {
                        alert(subObj);
                    }
                    /* так не прошло
                    if ( subObj.contains(".") || subObj.matches("[\\d]+") ) {
                        alert(Double.parseDouble(subObj));
                    } else {
                        alert(subObj);
                    }
                    */
                }
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}