package shapes;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author argjira
 */
public class RegularTriangle extends Shapes {
    
    public RegularTriangle(Point centerPoint,double sideLength){
        super(centerPoint,sideLength);
    }
    
    /**
     * This method is inherited from the parent class Shapes and is used to calculate the distance between the regular Triangle and a given point
     * @param p this is the first parameter of the method and it represents the point that will be given by the user in the console
     * @param centerPoint this is the second parameter of the method and it represents the center point of the regular triangle whose coordinates are given in the input file
     * @param sideLength  this is the third parameter of the method and it represents the side of the regular triangle whose value is given in the input file
     * @return the distance between the given point and the center point of the triangle by using the math formula
     */
    @Override
    public double calculateDistance(Point p,Point centerPoint,double sideLength){
        double dx = p.getX() - centerPoint.getX();
        double dy = p.getY() - centerPoint.getY();
        return Math.abs(Math.sqrt(dx*dx + dy*dy));
    }
    
    /**
     * We override the toString method in order to return a string representation of the regular Triangle object
     * @return string representation of triangle
     */
    @Override
    public String toString(){
        return "Triangle ( With Center point: " + centerPoint + " and side length " + sideLength + ")";
    }
    
}
