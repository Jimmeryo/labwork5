package com.lab111.labwork5.Observer;

import com.lab111.labwork5.Row;
import com.lab111.labwork5.Table;

public interface TableObserver {
    void update(Table table, String action, Row... rows);
}