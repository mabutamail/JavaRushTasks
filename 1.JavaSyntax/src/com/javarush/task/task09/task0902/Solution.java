package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.


Требования:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать имя метода, вызвавшего его.
4. Для получения имени вызвавшего метода, используй метод getMethodName.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        //System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();

        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements)      вай шайтан! shift+alt+лкм -пишем в нескольких местах!!!
//        {
//            System.out.println(element.getMethodName());      вай шайтан! shift+alt+лкм -пишем в нескольких местах!!!
//        }
//        System.out.println(stackTraceElements[1]);    вай шайтан! shift+alt+лкм -пишем в нескольких местах!!!
//        //System.out.println(stackTraceElements.length[]);    вай шайтан! shift+alt+лкм -пишем в нескольких местах!!!
//        Thread.currentThread().getStackTrace()[2].getMethodName();    вай шайтан! shift+alt+лкм -пишем в нескольких местах!!!
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
