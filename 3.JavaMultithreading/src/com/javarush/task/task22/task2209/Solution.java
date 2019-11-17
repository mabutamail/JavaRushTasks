package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Составить цепочку слов
В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставь все слова в таком порядке, чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Считай, что абсолютно все слова из исходного списка могут (и должны!) быть включены в результат (лишних слов нет).
Метод getLine должен возвращать любой правильный вариант при наличии нескольких таковых (см. пример).
Слова разделять пробелом.
Вывести полученную строку на экран.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
или
Вена Амстердам Мельбурн Нью-Йорк Киев
или
Мельбурн Нью-Йорк Киев Вена Амстердам
и т.п.


Требования:
1. Метод main должен считывать имя файла с клавиатуры.
2. В классе Solution не должно быть статических полей.
3. В методе getLine должен быть использован StringBuilder.
4. Метод getLine должен возвращать пустую строку (пустой StringBuilder) в случае если ему не были переданы параметры (слова).
5. Метод getLine не должен изменять переданные ему параметры (слова).
6. Все слова переданные в метод getLine должны быть включены в результирующую строку.
7. Вывод на экран должен соответствовать условию задачи.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            reader.close();
            String s;
            while ((s = fileReader.readLine()) != null) {
                sb.append(s).append(" ");
            }
        }
        StringBuilder result = getLine(sb.toString().trim().split(" +"));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        if (words == null || words.length == 0 || (words.length == 1 && words[0].isEmpty()))
            return sb;

        StringBuilder sb_repeatWords = new StringBuilder("__"); // "__" чтоб войти в for
        String[] copy_words = Arrays.stream(words).sorted(String::compareToIgnoreCase).toArray(String[]::new);

        sb.append(copy_words[0]);
        for (int i = 1; sb_repeatWords.length() > 1; i = 0) { //пока есть слова для добавления
            int numWords = copy_words.length;
            sb_repeatWords.setLength(0);

            for (char c_first, c_last; i < copy_words.length; i++) {
                c_first = Character.toLowerCase(copy_words[i].charAt(0));
                c_last = Character.toLowerCase(sb.charAt(sb.length()-1));
                if (c_first == c_last) { //Проверяем последний char из цепочки и первый char слова из набора
                    sb.append(' ').append(copy_words[i]);
                } else { //Проверяем первый char из цепочки и последний char слова из набора
                    c_last = Character.toLowerCase(copy_words[i].charAt(copy_words[i].length()-1));
                    c_first = Character.toLowerCase(sb.charAt(0));
                    if (c_last == c_first) {
                        sb.insert(0, ' ').insert(0, copy_words[i]);
                    } else sb_repeatWords.append(copy_words[i]).append(' ');
                }
            }

            copy_words = sb_repeatWords.toString().trim().split(" "); //Для повторного обхода
            if (copy_words.length == numWords) { //выход из повторов
                sb.append(' ').append(sb_repeatWords);
                sb.setLength(sb.length()-1);
                break;
            }
        }
        return sb;
    }
}