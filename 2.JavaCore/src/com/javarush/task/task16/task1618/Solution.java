package com.javarush.task.task16.task1618;

/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти,
а потом прерви ее используя метод interrupt().


Требования:
1. Класс TestThread должен быть унаследован от Thread.
2. Класс TestThread должен иметь public void метод run.
3. Метод main должен создавать объект типа TestThread.
4. Метод main должен вызывать метод start у объекта типа TestThread.
5. Метод main должен вызывать метод interrupt у объекта типа TestThread.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread tread = new TestThread();
        System.out.println(TestThread.currentThread().getName() + " 111111111111");
        tread.start();
        System.out.println(TestThread.currentThread().getName() + " 22222222222");
        tread.interrupt();
        System.out.println(TestThread.currentThread().getName() + " 33333333333");
        System.out.println(TestThread.currentThread().getStackTrace() + " 66666666666666666666666");
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run() {
            System.out.println(TestThread.currentThread().getName() + " 44444444444");

            try {
                while (interrupted()) {
                    System.out.println(currentThread().getStackTrace() + " 55555555555");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Stop thread");
            }
        }
    }
}