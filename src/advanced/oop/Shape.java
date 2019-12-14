package advanced.oop;

public class Shape {
    private int width;
    private int height;
    private int radius;


    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Shape(int radius) {
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
