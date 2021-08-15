package com.company;

import com.company.entities.Figure;
import com.company.entities.Square;
import com.company.entities.Triangle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();

        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Square(5, 10, 3, 8));
        figures.add(new Square(1, 2, 4, 6));

        figures.add(new Triangle(4, 5, 10, 0, 15, 8));

        for (int i = 0; i < figures.size(); i++) {

            figures.get(i).draw();

            /*Figure current = figures.get(i);

            switch (current.getName()){
                case "Square":
                    ((Square)current).draw();
                    break;
                case "Triangle":
                    ((Triangle)current).draw();
                    break;
            }*/
        }

        /*for (int i = 0; i < triangles.size(); i++) {
            triangles.get(i).draw();
        }*/

        /*for (int i = 0; i < squares.size(); i++) {
            squares.get(i).draw();
        }*/
    }
}
