package Shapes;

public class Square extends Figure implements Shape {

    public Square(String name, int area) {
        super(name, area);
        this.name = name;
        this.area = area;
    }

    @Override
    public Integer getArea() {
        return area;
    }
}
