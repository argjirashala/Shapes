/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author argjira
 */
public class Circle extends Shapes {
    
    public Circle(Point centerPoint,double radius){
        super(centerPoint,radius);
    }
    
    /**
     * This method is used to decide weather a given point is inside the circle or not
     * The decision is made by the math formula used in the method
     * @param p this is the first parameter of the method and it represents the point that will be given by the user in the console
     * @param circlePoint this is the second parameter of the method and it represents the center point of the circle whose coordinates are given in the input file
     * @param radius this is the third parameter of the method and it represents the radius of the circle whose value is given in the input file
     * @return true or false
     */
    public boolean isPointInCircle(Point p,Point circlePoint,double radius){
        if((p.getX() - circlePoint.getX())*(p.getX() - circlePoint.getX()) + 
                (p.getY() - circlePoint.getY())*(p.getY() - circlePoint.getY())
                <= radius * radius){
            return true;
        }else{
            return false;
        }
    }
    /**
     * In this method we return the distance between the circle and the point,this method is inherited from the parent class Shapes
     * In case of the circle if the point is inside the circle the distance will be automatically  zero
     * otherwise it will calculate the distance between the circle line and the given point
     * that is done by using the math formula
     * @param p this is the first parameter of the method and it represents the point that will be given by the user in the console
     * @param centerPoint this is the second parameter of the method and it represents the center point of the circle whose coordinates are given in the input file
     * @param radius this is the third parameter of the method and it represents the radius of the circle whose value is given in the input file
     * @return the distance between the line circle and the point if point is not in circle otherwise return zero
     */
    @Override
    public double calculateDistance(Point p,Point centerPoint,double radius){
        if(isPointInCircle(p,centerPoint,radius)){
            return 0;
        }else{
            double dx = p.getX() - centerPoint.getX();
            double dy = p.getY() - centerPoint.getY();
            return Math.abs((Math.sqrt(dx*dx + dy*dy)) - radius);
        }
    }
    
    /**
     * We override the toString method in order to return a string representation of the circle object
     * @return 
     */
    @Override
    public String toString(){
        return "Circle ( With Center point: " + centerPoint + " and radius " + sideLength + ")";
    }
}
