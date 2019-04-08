package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String q;
        private String w;
        private String e;
        private String r;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String q) {
            this.name = name;
            this.age = age;
            this.q = q;
        }

        public Human(String name, int age, String q, String w) {
            this.name = name;
            this.age = age;
            this.q = q;
            this.w = w;
        }

        public Human(String name, int age, String q, String w, String e) {
            this.name = name;
            this.age = age;
            this.q = q;
            this.w = w;
            this.e = e;
        }

        public Human(String name, int age, String q, String w, String e, String r) {
            this.name = name;
            this.age = age;
            this.q = q;
            this.w = w;
            this.e = e;
            this.r = r;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, String q) {
            this.age = age;
            this.q = q;
        }

        public Human(int age, String q, String w) {
            this.age = age;
            this.q = q;
            this.w = w;
        }

        public Human(int age, String q, String w, String e) {
            this.age = age;
            this.q = q;
            this.w = w;
            this.e = e;
        }

    }


}
