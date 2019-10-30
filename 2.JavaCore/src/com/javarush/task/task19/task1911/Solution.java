package com.javarush.task.task19.task1911;

/* 
Ридер обертка
В методе main подмени объект System.out написанной тобой
ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.


Требования:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое
поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку
"it's a text for testing".
5. Метод main(String[] args) класса Solution должен создавать поток
PrintStream (используй PrintStream c конструктором принимающим ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать
поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),
объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку
выведенную методом printSomething() согласно заданию, и выводить её в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        //запоминаем настоящий PrintStream в специальную переменную,
        // дабы потом вернуть его в изначальном виде.
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем ссылку на поток в виде динамического массив байтов
        PrintStream myStream = new PrintStream(outputStream);
        //создаем адаптер к классу PrintStream - ссылку
        // на свой поток из ранне объявленного динамического массива байтов
        System.setOut(myStream);
        //Устанавливаем свой поток/адаптер как текущее значение System.out
        testString.printSomething();
        //Вызываем функцию, которая по умолчанию выводит  в консоль сиречь
        // PrintStream текст "it's a text for testing", но!
        // PrintStream подменен нами на этом этапе выполнения программы на
        // свой адаптер - массив байтов.
        String result = outputStream.toString().toUpperCase();
        //переводим в "обертке" result все буквы в заглавные
        // из подмененного нами PrintStream, в котором на данный момент
        // валяется без дела строка
        // "it's a text for testing" из printSomething() в виде массива байтов
        System.setOut(consoleStream);
        // возвращаем переменной setOut исходное значение
        System.out.println(result);
        // в итоге строка выводится в upperCase, согласно нашей обертке
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}