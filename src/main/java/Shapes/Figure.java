package Shapes;

public class Figure implements Shape {

    public String name;
    int area;

    public Figure(String name, int area) {
        this.name = name;
        this.area = area;

    }

    public String getName() {
        return name;
    }

    @Override
    public Integer getArea() {
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


