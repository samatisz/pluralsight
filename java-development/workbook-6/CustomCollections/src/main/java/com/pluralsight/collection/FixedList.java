package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private ArrayList<T> items;

    public FixedList(int maxSize, ArrayList<T> items) {
        this.maxSize = maxSize;
        this.items = items;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ArrayList<T> getItems() {
        List<T> items = new ArrayList<>(maxSize);
        return getItems();
    }

    public void add(T i) {
      //  items.add();
    }

}
