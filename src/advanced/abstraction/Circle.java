package advanced.abstraction;

public class Circle extends Shape {
    public Circle(double perimeter, String name) {
        super(perimeter, name);
    }

 @Override
 public double getPerimeter(){
     System.out.println("inside Circle getPerimeter()");
     return 1;
 }
}
