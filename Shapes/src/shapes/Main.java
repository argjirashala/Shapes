/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes;
import java.util.*;
/**
 *
 * @author argjira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Shapes> shapes = new ArrayList<>();
        ReadFromFile readfromfile = new ReadFromFile();
        readfromfile.readFile(shapes);
        
        Scanner getPointData = new Scanner(System.in);
        System.out.println("Give the point");
        System.out.print("x is: ");
        Double x = getPointData.nextDouble();
        System.out.print("y is: ");
        Double y = getPointData.nextDouble();
        Point givenPoint = new Point(x,y);
        
        Shapes closestShape = null;
        double min = 100000000;
        for(Shapes shape : shapes){
            if(shapes.size() == 1){
                System.out.println("Since you only added one shape that is going to be the closest one");
                closestShape = shape;
            }
            if(shape.calculateDistance(givenPoint, shape.centerPoint, shape.sideLength) < min){
                min = shape.calculateDistance(givenPoint, shape.centerPoint, shape.sideLength);
                closestShape = shape;
            }
        }
        System.out.println("The shape which is closest to the given point is: " + closestShape);
        
    }
    
}
