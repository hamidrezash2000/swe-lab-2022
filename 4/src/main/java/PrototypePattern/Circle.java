package PrototypePattern;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return new Circle(super.getX(), super.getY(), super.getColor(), this.radius);
    }

    public int getRadius() {
        return radius;
    }
}