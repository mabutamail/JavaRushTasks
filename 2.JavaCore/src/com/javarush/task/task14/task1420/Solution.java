package com.javarush.task.task14.task1420;

/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.


Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в
положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД)
чисел считанных с клавиатуры и успешно завершаться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        if (i1 <= 0) throw new Exception();
        if (i2 <= 0) throw new Exception();
        System.out.println(nod(i1, i2));
    }

    static int nod(int a, int b) {
        if (b == 0) return a;
        int x = a % b;

        return nod(b, x);
    }

}

