package com.javarush.task.task36.task3601;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private static Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }

    public List<String> getData() {
        List<String> data = new ArrayList<String>() {{
            add("First string");
            add("Second string");
            add("Third string");
        }};
        return data;
    }

}
