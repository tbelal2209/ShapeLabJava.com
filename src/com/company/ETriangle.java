package com.company;


public class ETriangle extends Shape
{
    private int side;

    public ETriangle (int side)
    {
        super("ETriangle");
        this.side = side;
    }

    public double getArea()
    {
        return Math.sqrt(((side/2)^2)+ (side^2));
    }

    public double getPerimeter()
    {
        return (side*3);
    }
}
