package advanced.abstraction;

public abstract class Shape {
    private double perimeter;
    private String name;
    public double  getPerimeter(double perimeter, String name) {
        System.out.println("Inside of getPerimeter() method");
        return this.perimeter;

    }

    public Shape(double perimeter, String name) {
        this.perimeter = perimeter;
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
