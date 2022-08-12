package PrototypePattern;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(super.getX(), super.getY(), super.getColor(), this.width, this.height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}