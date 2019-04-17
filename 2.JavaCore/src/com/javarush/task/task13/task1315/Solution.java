package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
1. Создай классы Dog, Animal.Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
- Кот(Animal.Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.


Требования:
1. Класс Animal.Cat должен быть объявлен внутри класса Solution.
2. Класс Dog должен быть объявлен внутри класса Solution.
3. Класс Mouse должен быть объявлен внутри класса Solution.
4. Кот(Animal.Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
5. Мышь(Mouse) может передвигаться и может быть съедена.
6. Собака(Dog) может передвигаться и съесть кого-то.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat {
        @Override
        public void move() { }
        @Override
        public void eat() { }
    }

    class Cat implements Movable, Edible, Eat {
        @Override
        public void move() { }
        @Override
        public void beEaten() { }
        @Override
        public void eat() { }
    }

    class Mouse implements Movable, Edible {
        @Override
        public void move() { }
        @Override
        public void beEaten() { }
    }
}