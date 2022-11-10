package Shapes;

public class Triangle extends Figure implements Shape {
    public Triangle(String name, int area) {
        super(name, area);
    }

    @Override
    public Integer getArea() {
        return area;
    }
}
