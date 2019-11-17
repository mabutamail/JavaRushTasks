package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Требования:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/
public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("12", null);
        map.put(null, "123");
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        params.entrySet().stream()
            .filter(pair ->
                pair.getKey() != null
                    &&  pair.getValue() != null
                    && !pair.getKey().isEmpty()
                    && !pair.getValue().isEmpty()
            ).forEach(pair ->
            sb.append(pair.getKey())
                .append(" = '")
                .append(pair.getValue())
                .append("' and ")
        );
        int len = sb.length();
        sb.setLength(len > 4 ? len-5 : 0);
        return sb.toString();
    }
}