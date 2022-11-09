package Shapes;

public class Main {


    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Triangle("Triangle", 45);
        figures[1] = new Square("Square", 34);
        figures[2] = new Circle("Circle", 70);
        

        System.out.println();

        System.out.println();
        for (Figure value : figures) {
            System.out.println(value.getArea());
            System.out.println();
        }

    }
}

