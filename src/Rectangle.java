/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nolan Pelino
 */
public class Rectangle extends Shape
{
    private double side1;
    private double side2;
   

    public Rectangle(double s1, double s2)
    {
        super();
        side1 = s1;
        side2 = s2;
        super.area = side1*side2;
        super.type = "Rectangle";
    }
   

    public String toString()
    {
    return super.toString() + " Side 1: " + side1 + " Side 2: " + side2;
    }
}
