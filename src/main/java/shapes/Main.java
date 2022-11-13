package shapes;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Triangle("Triangle",3,4);
        figures[1] = new Square("Square", 10);
        figures[2] = new Circle("Circle", 3);
        figures[3] = new Circle("Circle", 4);

        System.out.println(figures[3].getArea() + "m²");

        System.out.println("загальна площа усіх фігур = " + Figure.getAllArea(figures) + "cm²");

        System.out.println();

        for (Figure figure : figures) {
            System.out.println("площа " + figure.name + " = " + figure.getArea() + "cm²");

        }
    }
}

