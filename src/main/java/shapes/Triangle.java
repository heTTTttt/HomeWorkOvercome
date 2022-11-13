package shapes;

public class Triangle extends Figure implements Shape {
    public Triangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return 0.5 * (a * b);
    }
}
