package com.lab111.labwork5;

import java.util.HashMap;
import java.util.Map;

public class Row {
    private Map<String, Object> data;

    public Row() {
        this.data = new HashMap<>();
    }

    public void setValue(String column, Object value) {
        data.put(column, value);
    }

    public Object getValue(String column) {
        return data.get(column);
    }

    @Override
    public String toString() {
        return "Row{" + "data=" + data + '}';
    }
}