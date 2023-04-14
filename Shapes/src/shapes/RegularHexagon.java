/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;;

/**
 *
 * @author argjira
 */
public class RegularHexagon extends Shapes {
    
    public RegularHexagon(Point centerPoint,double sideLength){
        super(centerPoint,sideLength);
    }
    
    /**
     * This method is inherited from the parent class Shapes and is used to calculate the distance between the regular hexagon and a given point
     * @param p this is the first parameter of the method and it represents the point that will be given by the user in the console
     * @param centerPoint this is the second parameter of the method and it represents the center point of the regular hexagon whose coordinates are given in the input file
     * @param sideLength this is the third parameter of the method and it represents the side of the regular hexagon whose value is given in the input file
     * @return the distance between the given point and the center point of the hexagon by using the math formula
     */
    @Override
    public double calculateDistance(Point p,Point centerPoint,double sideLength){
        double dx = p.getX() - centerPoint.getX();
        double dy = p.getY() - centerPoint.getY();
        return Math.abs(Math.sqrt(dx*dx + dy*dy));
    }
    
    /**
     * We override the toString method in order to return a string representation of the regular Triangle object
     * @return string representation of hexagon
     */
    @Override
    public String toString(){
        return "Hexagon ( With Center point: " + centerPoint + " and side length " + sideLength + ")";
    }
    
}
