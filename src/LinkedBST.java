
import java.time.temporal.Temporal;

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
public class LinkedBST <T extends Comparable<T>> {
    
    private class Node {
        T data;
        Node leftChild;
        Node rightChild;
        
        public Node(T aData) {
            data = aData;
            leftChild = rightChild = null;
        }
    }
    
    private Node root; //head
    public LinkedBST()
    {
        root = null;
    }
    
    public void add(T aData){
        if(root == null)
            root = new Node(aData);
        else
            add(root, aData);
    }
    
    private Node add(Node aNode, T aData){
        if (aNode == null)
            aNode = new Node(aData);
        else if(aData.compareTo(aNode.data) < 0) //GO LEFT
            aNode.leftChild = add(aNode.leftChild, aData);
        else if(aData.compareTo(aNode.data) > 0) //GO RIGHT
            aNode.rightChild = add(aNode.rightChild, aData);
        return aNode;
    }
    
    public void printPreorder()
    {
        printPreorder(root);
    }
    public void printPreorder(Node aNode)
    {
        if(aNode == null)
            return;
        System.out.println(aNode.data);//PROCESS
        printPreorder(aNode.leftChild);//LEFT
        printPreorder(aNode.rightChild);//RIGHT;
    }
    
    public void printInorder(){
        printInorder(root);
    }
    public void printInorder(Node aNode){
        if(aNode == null)
            return;
        printInorder(aNode.leftChild);//LEFT
        System.out.println(aNode.data);//PROCESS
        printInorder(aNode.rightChild);//RIGHT
    }
    
    public void printPostorder(){
        printPostorder(root);
    }
    public void printPostorder (Node aNode){
        if(aNode == null)
            return;
        printPostorder(aNode.leftChild);
        printPostorder(aNode.rightChild);
        System.out.println(aNode.data);
    }
    
    public boolean search(T aData){
        return search(root, aData);
    }
    public boolean search(Node aNode, T aData){
        if(aNode == null)
            return false;
        else if(aData.compareTo(aNode.data) < 0)//GO LEFT
            return search(aNode.leftChild, aData);
        else if(aData.compareTo(aNode.data) > 0)//GO RIGHT
            return search(aNode.rightChild, aData);
        else
            return true;
    }
    
    public void remove(T aData){
        root = remove(root, aData);
    }
    public Node remove(Node aNode, T aData){
        //Find the Node
        if(aNode == null)
            return null;
         else if(aData.compareTo(aNode.data) < 0)
             aNode.leftChild = remove(aNode.leftChild, aData);
        else if(aData.compareTo(aNode.data) > 0)
            aNode.rightChild = remove(aNode.rightChild, aData);
        else //when it is found
        {
            if (aNode.rightChild == null)
                return aNode.leftChild;
            else if (aNode.leftChild == null)
                return aNode.rightChild;
            Node temp = findMinInTree(aNode.rightChild);
            aNode.data = temp.data;
            aNode.rightChild = remove(aNode.rightChild, temp.data);
        }
        return aNode;
    }
    
    public void deleteAreas(double max){
        deleteAreas(max, root);
    }
    
    public void deleteAreas(double max, Node aNode){
       if(getMaxArea() > max)
       {
           remove(this.getMaxNode().data);
           deleteAreas(max);
           return;
           
       }
       else
       {
           return;
       }
    }
    
    private Node findMinInTree(Node aNode){
        if(aNode == null)
            return null;
        else if(aNode.leftChild == null)
            return aNode;
        else
            return findMinInTree(aNode.leftChild);
    }
    
    
    public double getMaxArea(){
        Node t = root;
        while(t.rightChild != null)
            t= t.rightChild;
        double maxAr = ((Shape)t.data).getArea();
        return maxAr;
            
    }
    
    public Node getMaxNode(){
        Node t = root;
        while(t.rightChild != null)
            t= t.rightChild;
        return t;
    }
    
    
    
    
}
