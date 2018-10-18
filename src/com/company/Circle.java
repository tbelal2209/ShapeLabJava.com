package com.company;


public class Circle extends Shape
{
    private int radius;

    public Circle (int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    public double getArea()
    {
        return 3.14 * (radius * radius);
    }

    public double getPerimeter()
    {
        return (2 * radius) * 3.14;
    }
}

