package com.beans;

public class Triangle extends Shape {
    private float base, height, s1, s2;

    public Triangle() {
        super();
    }

    public Triangle(String c, float base, float height, float s1, float s2) {
        super(c);
        this.base = base;
        this.height = height;
        this.s1 = s1;
        this.s2 = s2;
    }

    public float calcArea() {
        return 0.5f * base * height;
    }

    public float calcPerimeter() {
        return base + s1 + s2;
    }

    @Override
    public String toString() {
        return super.toString() + " Triangle [base=" + base + ", height=" + height + ", s1=" + s1 + ", s2=" + s2 + "]";
    }
}
