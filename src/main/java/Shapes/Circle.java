package Shapes;

public class Circle extends Figure implements Shape {

    public Circle(String name, int area) {
        super(name, area);
        this.name = name;
        this.area = area;
    }

    @Override
    public Integer getArea() {
        return area;
    }
}
