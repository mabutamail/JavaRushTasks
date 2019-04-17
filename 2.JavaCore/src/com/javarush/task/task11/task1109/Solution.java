package com.javarush.task.task11.task1109;

/* 
Как кошка с собакой
Скрыть все внутренние переменные класса Animal.Cat и Dog.
Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.


Требования:
1. Переменные класса Animal.Cat должны быть скрыты.
2. Переменные класса Dog должны быть скрыты.
3. Методы класса Animal.Cat должы быть скрыты.
4. Методы класса Dog должы быть скрыты.
5. Методы, с помощью которых классы Animal.Cat и Dog взаимодействуют друг с другом,
должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}



