package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.Collections;
import java.util.List;

public class Provider {
    public Strategy getStrategy() {
        return strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString){
        if(searchString == null) return Collections.emptyList();
        return null;
    }

    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public Provider() {

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
