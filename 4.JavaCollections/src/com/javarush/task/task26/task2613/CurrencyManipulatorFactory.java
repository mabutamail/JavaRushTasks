package com.javarush.task.task26.task2613;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public final class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> map = new HashMap<>();

    private CurrencyManipulatorFactory() {}

//    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
//        return null;
//    }

    

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        if (!map.containsKey(currencyCode))
            map.put(currencyCode, new CurrencyManipulator(currencyCode));

        return map.get(currencyCode);
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return map.values();
    }
}

//    Класс CurrencyManipulatorFactory должен иметь статический метод
//    getManipulatorByCurrencyCode(String currencyCode).