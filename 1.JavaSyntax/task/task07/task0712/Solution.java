package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    ArrayList<String> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    list.add(reader.readLine());
    int minLength = list.get(0).length();
    int maxLength = list.get(0).length();
    int minIndex = 0;
    int maxIndex = 0  ;

    for (int i = 1; i < 10; i++) {

      list.add(reader.readLine());
      if (list.get(i).length() < minLength) {
        minLength = list.get(i).length();
        minIndex = i;                       //самаяя короткая строка с индексом min
      }
      if (list.get(i).length() > maxLength) {
        maxLength = list.get(i).length();
        maxIndex = i;    //самая длинная строка с индексом max
      }
    }
//
//    System.out.println("minIndex " + minIndex + " maxIndex " + maxIndex);
//    System.out.println("самая короткая строка с индексом minIndex " + list.get(minIndex));
//    System.out.println("самая длинная строка с индексом maxIndex " + list.get(maxIndex));

    if (minIndex < maxIndex) System.out.println(list.get(minIndex));
    else System.out.println(list.get(maxIndex));
  }
}
