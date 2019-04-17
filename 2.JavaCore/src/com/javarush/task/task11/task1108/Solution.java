package com.javarush.task.task11.task1108;

/* 
Неприступный кот
Скрыть все внутренние переменные класса Animal.Cat, а также методы,
позволяющие менять внутреннее состояние объектов класса Animal.Cat.


Требования:
1. Переменная name класса Animal.Cat должна быть скрыта.
2. Переменная age класса Animal.Cat должна быть скрыта.
3. Переменная weight класса Animal.Cat должна быть скрыта.
4. В Animal.Cat должны быть private и public методы.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}
