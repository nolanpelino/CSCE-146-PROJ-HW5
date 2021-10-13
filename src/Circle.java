/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nolan Pelino
 */
import java.lang.Math.*;
public class Circle extends Shape{
    private double radius;
   
    public Circle(double rad)
    {
        radius = rad;
        super.area = radius * radius * Math.PI;
        super.type = "Circle";
    }
   
    
    public String toString()
    {
    return super.toString() + " Radius: " + radius;
    }
}

