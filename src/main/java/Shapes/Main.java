

import Shapes.Figure;


public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Figure("Triangle", 45);
        figures[1] = new Figure("Square", 34);
        figures[2] = new Figure("Circle", 70);
        figures[3] = new Figure("Circle", 25);

        System.out.println();

        System.out.println(Figure.getAllArea(figures));

        System.out.println();

        for (Figure figure : figures) {
            System.out.println("площа " + figure.name + " = " + figure.getArea() + "m²");
            System.out.println("загальна площа усіх фігур = " + Figure.getAllArea(figures));
        }
    }
}

