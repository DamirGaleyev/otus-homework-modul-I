package ru.otus.java.basic.homework6;

public class FoodPackage {
    private int capacity;
    private boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FoodPackage(int capacity) {
        this.capacity = capacity;
        this.empty = false;
    }

    public int transfer() {
        empty = true;
        return capacity;
    }

}



