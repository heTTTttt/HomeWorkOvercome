package shapes;

public class Circle extends Figure implements Shape {

    public Circle(String name, int r) {
        super(name);
        this.name = name;
        this.r = r;

    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    } // r * r = r².
}
