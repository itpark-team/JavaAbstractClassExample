package com.company.entities;

public class Triangle extends Figure {
    private int x2, y2;
    private int x3, y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, "Triangle");
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void draw() {
        String output = String.format("Name: %s, x1: %d, y1: %d, x2: %d, y2: %d, x3: %d, y3: %d", getName(), getX1(), getY1(), x2, y2, x3, y3);
        System.out.println(output);
    }
}
