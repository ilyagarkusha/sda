package advanced.composition;

public class Square extends GeometricObject{
    double length;

    Square(double length) {
        new GeometricObject(length);
    }
}
