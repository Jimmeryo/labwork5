package com.lab111.labwork5;

import com.lab111.labwork5.Observer.TriggerObserver;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        TriggerObserver trigger = new TriggerObserver();
        table.addObserver(trigger);

        Row row1 = new Row();
        row1.setValue("id", 1);
        row1.setValue("name", "John");

        System.out.println("Adding a row:");
        table.addRow(row1);

        Row row2 = new Row();
        row2.setValue("id", 1);
        row2.setValue("name", "Jane");

        System.out.println("\nUpdating a row:");
        table.updateRow(0, row2);

        System.out.println("\nDeleting a row:");
        table.deleteRow(0);
    }
}