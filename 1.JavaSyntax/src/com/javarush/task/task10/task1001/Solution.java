package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную a типа int.
4. Метод main() должен содержать переменную b типа int.
5. Метод main() должен содержать переменную c типа byte.
6. Метод main() должен содержать переменную f типа double.
7. Метод main() должен содержать переменную d типа long.
8. Начальное значение переменных при инициализации менять нельзя.
Можно только редактировать операторы приведения типа (добавлять/удалять/изменять).
9. Программа должна выводить число больше, чем 0.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;              //46
        //System.out.println(b);
        byte c = (byte) (a * b);            //0
        //System.out.println(c);
        double f = (char) 1234.15;          //1234.0
        //System.out.println("f " + f);
        long d = (int) (a + f/c + b);    //0 + infinity + 46
//        System.out.println((long)f/c);
//        System.out.println("int a + " + a + " double f/byte c " + f/c + " + int b " + b);
//        System.out.println("c  " + c);
        System.out.println(d);
    }
}
