package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Serializable Solution
 * Сериализуй класс Solution.
 * Подумай, какие поля не нужно сериализовать, пометь ненужные
 * поля модификатором transient.
 * Объект всегда должен содержать актуальные итоговые данные.
 * Метод main не участвует в тестировании.
 * <p>
 * Написать код проверки самостоятельно в методе main:
 * 1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
 * 2) создать экземпляр класса Solution - savedObject;
 * 3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
 * 4) создать другой экземпляр класса Solution с другим параметром;
 * 5) загрузить из потока на чтение объект - loadedObject;
 * 6) проверить, что savedObject.string равна loadedObject.string;
 * 7) обработать исключения.
 * <p>
 * <p>
 * Требования:
 * 1. Поле pattern должно быть отмечено модификатором transient.
 * 2. Поле currentDate должно быть отмечено модификатором transient.
 * 3. Поле temperature должно быть отмечено модификатором transient.
 * 4. Поле string НЕ должно быть отмечено модификатором transient.
 */
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println(new Solution(4));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/ser.txt"));
        Solution savedObject = new Solution(4);
        oos.writeObject(savedObject);
        oos.flush();
        oos.close();

        Solution loadedObject = new Solution(10);
        System.out.println(loadedObject);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/ser.txt"));
        loadedObject = (Solution) ois.readObject();
        System.out.println(loadedObject);

        if (savedObject.string.equals(loadedObject.string))
            System.out.println("Strings are equal");
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}