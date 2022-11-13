package shapes;

public class Figure implements Shape {

    public String name;
    int area;
    int a;
    int b;
    int r;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }
    public static int getAllArea(Figure[] figures){
        int a = 0;
        for (Figure figure : figures){
            a += figure.getArea();
        }
        return a;
    }
}


