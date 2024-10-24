package com.beans;

abstract public class Shape {
    private String colour;

    public Shape() {
        super();
    }

    public Shape(String colour) {
        super();
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shape [colour=" + colour + "]";
    }

    public abstract float calcArea();
    public abstract float calcPerimeter();
}
