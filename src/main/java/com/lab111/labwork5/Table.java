package com.lab111.labwork5;

import com.lab111.labwork5.Observer.TableObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a relational table in the database.
 * This class acts as the ConcreteSubject in the Observer pattern.
 */
public class Table {
    /** List to store the rows of the table. */
    private List<Row> rows;
    
    /** List to store the observers of the table. */
    private List<TableObserver> observers;

    /**
     * Constructs a new Table instance.
     * Initializes the rows and observers lists.
     */
    public Table() {
        this.rows = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    /**
     * Adds a new row to the table and notifies observers.
     * @param row The row to be added.
     */
    public void addRow(Row row) {
        rows.add(row);
        notifyObservers("add", row);
    }

    /**
     * Updates an existing row in the table and notifies observers.
     * @param index The index of the row to be updated.
     * @param newRow The new row data.
     */
    public void updateRow(int index, Row newRow) {
        if (index >= 0 && index < rows.size()) {
            Row oldRow = rows.get(index);
            rows.set(index, newRow);
            notifyObservers("update", oldRow, newRow);
        }
    }

    /**
     * Deletes a row from the table and notifies observers.
     * @param index The index of the row to be deleted.
     */
    public void deleteRow(int index) {
        if (index >= 0 && index < rows.size()) {
            Row removedRow = rows.remove(index);
            notifyObservers("delete", removedRow);
        }
    }

    /**
     * Adds an observer to the table.
     * @param observer The observer to be added.
     */
    public void addObserver(TableObserver observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the table.
     * @param observer The observer to be removed.
     */
    public void removeObserver(TableObserver observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers about changes in the table.
     * @param action The type of action performed (add, update, delete).
     * @param rows The rows affected by the action.
     */
    private void notifyObservers(String action, Row... rows) {
        for (TableObserver observer : observers) {
            observer.update(this, action, rows);
        }
    }
}