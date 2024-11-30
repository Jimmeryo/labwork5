package com.lab111.labwork5.Observer;

import com.lab111.labwork5.Row;
import com.lab111.labwork5.Table;

public class TriggerObserver implements TableObserver {
    @Override
    public void update(Table table, String action, Row... rows) {
        System.out.println("Trigger activated!");
        System.out.println("Action: " + action);
        for (Row row : rows) {
            System.out.println("Affected row: " + row);
        }
        // Here you can implement specific trigger logic
        System.out.println("Trigger execution completed.");
    }
}