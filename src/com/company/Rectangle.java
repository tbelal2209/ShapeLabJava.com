package com.company;


public class Rectangle extends Shape
{
    private int side;

    public Rectangle (int side)
    {
        super("Rectangle");
        this.side = side;
    }

    public double getArea()
    {
        return side * (side/2);
    }

    public double getPerimeter()
    {
        return (side * 3);
    }
}
