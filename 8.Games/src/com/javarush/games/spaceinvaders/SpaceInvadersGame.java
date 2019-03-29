package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;

public class SpaceInvadersGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    //В методе initialize() должен быть вызван метод setScreenSize(int, int) класса Game
    // c параметрами WIDTH и HEIGHT.

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        drawScene();
    }

    private void drawScene() {
        drawField();
    }

    private void drawField() {

        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKGREEN, "");
            }
        }
    }

}

//        Игра Space Invaders (3/34)
//        Давай реализуем метод drawField() — закрасим игровое поле одним цветом.
//        Поскольку в игре будут разные игровые объекты, вынесем их общие характеристики,
//        такие как координаты положения на игровом поле, в отдельный родительский класс GameObject.
//        Первыми игровыми объектами будут звезды. Для их описания создадим класс Star,
//        который унаследуем от класса GameObject.

//        Требования:
//        1. В методе drawField() необходимо вызвать для всех ячеек отображения метод
//        setCellValueEx(int, int, Color, String) с параметрами: координаты x и y, любой цвет (например, Color.BLACK)
//        и пустую строку.
//        2. В пакете gameobjects в отдельном файле должен существовать публичный класс GameObject.
//        3. В классе GameObject должно существовать публичное поле x типа double.
//        4. В классе GameObject должно существовать публичное поле y типа double.
//        5. В классе GameObject должен существовать публичный конструктор с двумя параметрами типа double,
//        который устанавливает соответствующие значения полям x и y.
//        6. В пакете gameobjects в отдельном файле должен существовать публичный класс Star.
//        7. Класс Star должен быть наследником класса GameObject.
//        8. В классе Star должен существовать публичный конструктор с двумя параметрами типа double,
//        который вызывает конструктор базового класса с этими же параметрами.




//        Игра Space Invaders (2/34)
//        Все игровые действия происходят в космосе. Для его отрисовки объявим метод drawField().
//        Создавать все элементы игры будем в методе createGame(), а отрисовывать их — в методе drawScene().
//        Все объекты создаются при запуске игры, поэтому в методе initialize()
//        вызовем setScreenSize(int, int), а после него — метод createGame().
//
//
//        Требования:
//        1. В классе SpaceInvadersGame должен существовать приватный метод void createGame().
//        2. В классе SpaceInvadersGame должен существовать приватный метод void drawScene().
//        3. В классе SpaceInvadersGame должен существовать приватный метод void drawField().
//        4. В методе drawScene() должен быть вызван метод drawField().
//        5. В методе createGame() должен быть вызван метод drawScene().
//        6. В методе initialize() должен быть вызван метод createGame().
//        7. В методе initialize() метод createGame() должен вызываться после setScreenSize(int, int).

