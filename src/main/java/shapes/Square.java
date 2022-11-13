package shapes;

public class Square extends Figure implements Shape {

    public Square(String name, int a) {
        super(name);
        this.name = name;
        this.a = a;
    }


    @Override
    public double getArea() {
        return a * a;
    } // а * а = а².
}
