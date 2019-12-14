package advanced.interfaceLesson;

public class Circle implements Shape {

    @Override
    public double getArea() {
        return 10;
    }

    @Override
    public double getPerimeter() {
        return 45;
    }

    String name;

    public String getName() {
        return name;
    }
}
