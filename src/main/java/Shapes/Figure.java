package Shapes;

public class Shape implements Area{

    public String name;
    public Integer area;

    public Shape(String name, Integer area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer area() {
        return null;
    }
    public void getAllShapes(){
        System.out.println(area()+area()+area());
    }
}
