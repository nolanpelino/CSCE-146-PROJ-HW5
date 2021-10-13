/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nolan Pelino
 */
public class Shape implements Comparable<Shape>{
    public double area;
    public String type;
   

    public Shape()
    {
    area = 0;
    type = "";
    }
   
    public double getArea()
    {
        return this.area;
    }
   
    public String getType()
    {
    return this.type;
    }
   
    
     public int compareTo(Shape aShape)
    {
        if(aShape == null)
            return -1;
        if(this.area < aShape.getArea())
            return -1;
        else if(this.area > aShape.getArea())
            return 1;
        else
            return this.type.compareTo(aShape.getType());
    }
     
     public String toString(){
         return type + "- Area: " + area;
     }
}

