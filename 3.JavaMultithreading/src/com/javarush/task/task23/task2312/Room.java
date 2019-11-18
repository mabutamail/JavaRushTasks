package com.javarush.task.task23.task2312;

/**
 * Требования:
 * 1. В классе Room должен быть создан метод createMouse.
 * 2. В методе createMouse должна быть создана новая мышь по правилам описанным в условии и сохранена в поле mouse.
 * 3. В классе Room должен быть создан метод eatMouse.
 * 4. В методе eatMouse должен содержаться вызов метода createMouse.
 */

public class Room {
    public static Room game;

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void run() {
    }

    public void print() {
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        mouse = new Mouse(x, y);
    }

    public void eatMouse() {
        createMouse();
    }


    public static void main(String[] args) {
        Snake snake = new Snake(0, 0);
        game = new Room(400, 400, snake);
        game.snake.setDirection(SnakeDirection.DOWN);
        //Room room = new Room(400, 400, snake);

    }
}