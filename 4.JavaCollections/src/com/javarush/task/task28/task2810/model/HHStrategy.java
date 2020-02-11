package com.javarush.task.task28.task2810.model;

public class HHStrategy implements Strategy {
    //private static final String URL_FORMAT = "https://javarush.ru/testdata/big28data.html";

    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";
    String url = String.format(URL_FORMAT, "Kiev", 3);

//    @Override
//    public List<Vacancy> getVacancies(String searchString) {
//        return new ArrayList<>();
//    }
}