package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0
double d = (short) 2.50256e2d;
char c = (short) 'd';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (d * s) - 500e-3;


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную c типа char.
4. Метод main() должен содержать переменную s типа short.
5. Метод main() должен содержать переменную i типа int.
6. Метод main() должен содержать переменную f типа float.
7. Метод main() должен содержать переменную d типа double.
8. Метод main() должен содержать переменную result типа double.
9. Начальное значение переменных при инициализации менять нельзя.
Можно добавлять только операторы приведения типа.
10. Программа должна выводить текст "result: 1000.0".
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
//        System.out.println("2.50256e2d                      " + 2.50256e2d);
//        System.out.println("ddddddddddd___short             " + (short)d);
//        System.out.println("ddddddddddddddddddd             " + d);
//        System.out.println("");

        char c = (short) 'd';
//        System.out.println(" 'd''d''d''d''d''d'             " + 'd');
//        System.out.println("(short) 'd'(short) 'd'          " + (short) 'd');
//        System.out.println("ccccccccccccccccccc             " + c);
//        System.out.println("");

        short s = (short) 2.22;
//        System.out.println("sssssssssssssssssss             "+s);
//        System.out.println("");

        int i = 150000;
//        System.out.println("(short) 150000                  " + (short) 150000);
//        System.out.println("iiiiiiiiiiiiiiiiiii             "+i);
//        System.out.println("");

        float f = 0.50f;
//        System.out.println("0.50f0.50f0.50f0.50f            " + 0.50f);
//        System.out.println("(short)0.50f  (short)0.50f      " + (short) 0.50f);
//        System.out.println("fffffffffffffffffff             " + f);
//        System.out.println("");

        double result = f + (i / c) - (d * s) - 500e-3;
//        System.out.println("        f:      " + f);
//        System.out.println("i:      " + i);
//        System.out.println("c:      " + c);
//        System.out.println("        i / c:  " + i / c);
//        System.out.println("d:      " + d);
//        System.out.println("s:      " + s);
//        System.out.println("        d * s:  " + d * s);
//        System.out.println("        500e-3: " + 500e-3);
        System.out.println("result: " + result);
    }
}