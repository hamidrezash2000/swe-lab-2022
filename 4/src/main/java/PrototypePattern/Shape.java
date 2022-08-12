package PrototypePattern;

import java.lang.Cloneable;

public abstract class Shape implements Cloneable {
    private int x;
    private int y;
    private String color;

    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }
}
