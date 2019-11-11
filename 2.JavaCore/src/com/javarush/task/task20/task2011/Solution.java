package com.javarush.task.task20.task2011;

import java.io.*;

/**
 * Externalizable для апартаментов
 * Реализуй интерфейс Externalizable в классе Apartment.
 * <p>
 * <p>
 * Требования:
 * 1. Класс Solution.Apartment должен поддерживать интерфейс Externalizable.
 * 2. В классе Solution.Apartment должен быть реализован метод writeExternal
 * с одним параметром типа ObjectOutput.
 * 3. В классе Solution.Apartment должен быть реализован метод readExternal
 * с одним параметром типа ObjectInput.
 * 4. В методе writeExternal, на полученном в качестве параметра объекте
 * типа ObjectOutput должен быть вызван метод writeObject с параметром address.
 * 5. В методе writeExternal, на полученном в качестве параметра объекте типа
 * ObjectOutput должен быть вызван метод writeInt с параметром year.
 * 6. Метод readExternal должен корректно восстанавливать из ObjectInput
 * значение поля address.
 * 7. Метод readExternal должен корректно восстанавливать из ObjectInput
 * значение поля year.
 */

public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject(address);
            objectOutput.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this.address = (String) objectInput.readObject();
            this.year = objectInput.readInt();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Apartment apt = new Apartment("г.Москва, Кутузовский просп., дом 18", 2017);
//        ObjectOutputStream ou = new ObjectOutputStream(new FileOutputStream("D:/task2011.dat"));
//        ou.writeObject(apt);
//        ou.close();
//        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:/task2011.dat"));
//        Apartment reApt = (Apartment) oi.readObject();
//        System.out.println(reApt.toString());
//        oi.close();

    }
}
