/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nolan Pelino
 */
import java.util.*;
import java.io.*;
public class ShapeTester {
    public static void main(String[] args) {
        System.out.println("This is the shape tree. \nPopulating tree.\n");
        LinkedBST<Shape> shapeTree = new LinkedBST<Shape>();
        
        try {
            Scanner fileScan = new Scanner(new File("shapeFile.txt"));
            while(fileScan.hasNextLine())
            {
                String currLine = fileScan.nextLine();
                String[] splitLine = currLine.split("\t");
                if(splitLine[0].equalsIgnoreCase("Rectangle"))
                {
                    Rectangle rect = new Rectangle(Double.parseDouble(splitLine[1]), Double.parseDouble(splitLine[2]));
                    shapeTree.add(rect);
                }
                else if (splitLine[0].equalsIgnoreCase("circle"))
                {
                    Circle circ = new Circle(Double.parseDouble(splitLine[1]));
                    shapeTree.add(circ);
                }
                else if (splitLine[0].equalsIgnoreCase("Right Triangle"))
                {
                    RightTriangle rt = new RightTriangle(Double.parseDouble(splitLine[1]), Double.parseDouble(splitLine[2]));
                    shapeTree.add(rt);
                }
                
            }
            fileScan.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("That line is not properly formatted.");
        }
        shapeTree.printPreorder();
        System.out.println("\nremoved two shapes");
        shapeTree.remove(new Rectangle(3, 8));
        shapeTree.remove(new Circle(9));
        System.out.println("\nPreorder");
        shapeTree.printPreorder();
        System.out.println("\nPostorder");
        shapeTree.printPostorder();
        System.out.println("\nInorder");
        shapeTree.printInorder();
        System.out.println("\nRemoving > 25\n");
        shapeTree.deleteAreas(25.0);
        shapeTree.printInorder();
    }
}
