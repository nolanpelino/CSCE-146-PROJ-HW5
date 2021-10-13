/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nolan Pelino
 */
public class RightTriangle extends Shape
{
    private double side1;
    private double side2;
   
    public RightTriangle(double aside1, double aside2)
    {
        side1 = aside1;
        side2 = aside2;
        super.area = side1 * side2 * .5;
        super.type = "Right Triangle";
    }
   
    public String toString()
    {
    return super.toString() + " Base: " + side1 + " Height: " + side2;
    }
}
