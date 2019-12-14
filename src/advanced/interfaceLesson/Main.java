package advanced.interfaceLesson;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println(circle.getArea());


        double area = perimeter(circle);
        System.out.println(area);


    }
    public static double perimeter(Shape shape){
        return 10;
    }
}
