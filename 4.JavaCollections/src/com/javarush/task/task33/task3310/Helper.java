package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Helper {
    public static String generateRandomString() {

//        Перечитай условие и воспользуйся любимым поисковиком.
//        Должно получиться что-то вроде
//    new BigInteger(130, new SecureRandom()).toString(36).


        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(36);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}