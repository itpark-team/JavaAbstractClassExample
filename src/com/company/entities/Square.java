package com.company.entities;

public class Square extends Figure {
    private int w, h;

    public Square(int x1, int y1, int w, int h) {
        super(x1, y1, "Square");
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        String output = String.format("Name: %s, x1: %d, y1: %d, w: %d, h: %d", getName(), getX1(), getY1(), w, h);
        System.out.println(output);
    }
}
