package com.javarush.task.task23.task2301;

/* 
Запрети наследование
Запрети наследование от класса Listener.


Требования:
1. Класс Listener должен быть создан внутри класса Solution.
2. Класс Listener должен быть публичным.
3. Класс Listener должен быть статическим.
4. Должна быть запрещена возможность стать потомком класса Listener.
*/
public class Solution {

    public static final class Listener {
        public void onMouseDown(int x, int y) {
            // Do something when the mouse down event occurs
        }

        public void onMouseUp(int x, int y) {
            // Do something when the mouse up event occurs
        }
    }

    public static void main(String[] args) {

    }

}
