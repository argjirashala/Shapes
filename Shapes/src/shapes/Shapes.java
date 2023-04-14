/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author argjira
 */
public abstract class Shapes {
    protected Point centerPoint;
    protected double sideLength;
    
    public Shapes(Point centerPoint, double sideLength){
        this.centerPoint = centerPoint;
        this.sideLength = sideLength;
    }
    
    /**
     * This method will be abstract and will be inherited by the children classes
     * @param p this is the first parameter of the method and it represents the point that will be given by the user in the console
     * @param c this is the second parameter of the method and it represents the center point of the shape
     * @param length this is the third parameter of the method and it represents the length of the shape
     * @return the distance dependently on the shape
     */
    public abstract double calculateDistance(Point p, Point c, double length);
}
