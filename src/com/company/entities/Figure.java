package com.company.entities;

public abstract class Figure {
    private int x1, y1;
    private String name;

    public Figure(int x1, int y1, String name) {
        this.x1 = x1;
        this.y1 = y1;
        this.name = name;
    }

    public abstract void draw();

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int newX, int newY) {
        x1 = newX;
        y1 = newY;
    }
}
