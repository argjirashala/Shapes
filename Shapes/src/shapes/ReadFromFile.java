/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;
import java.util.*;
import java.io.*;
/**
 *
 * @author argjira
 */
public class ReadFromFile {
    public void readFile(ArrayList<Shapes> dataOfShapes){
        Scanner getFileName = new Scanner(System.in);
        String fileName;
        File file;
        System.out.print("Enter the file name: ");
        do{
            try{
                fileName = getFileName.nextLine();
                file = new File(fileName);
                if(file.exists()){
                    break;
                }else{
                    throw new FileNotFoundException();
                }
            }catch(FileNotFoundException e){
                System.err.println("This file name is not correct, enter a new one: ");
                }
        }while(true);
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String currLine;
            int dataLength = Integer.parseInt(br.readLine());
            int i = 0;
            while(i < dataLength){
                if((currLine = br.readLine()) != null){
                    String[] dataOfLine = currLine.split(" ");
                    if(dataOfLine.length == 4){
                        String shape = dataOfLine[0].toLowerCase();
                        double x = Double.parseDouble(dataOfLine[1]);
                        double y = Double.parseDouble(dataOfLine[2]);
                        double sideLength = Double.parseDouble(dataOfLine[3]);
                        if( y < 0 || sideLength < 0){
                            throw new IllegalArgumentException();
                        }
                        switch(shape){
                            case "c":
                                Point cP = new Point(x,y);
                                double radius = sideLength;
                                Circle circle = new Circle(cP,radius);
                                dataOfShapes.add(circle);
                                break;
                            case "s":
                                Point sP = new Point(x,y);
                                double side = sideLength;
                                Square square = new Square(sP,side);
                                dataOfShapes.add(square);
                                break;
                            case "t":
                                Point tP = new Point(x,y);
                                double tsideLength = sideLength;
                                RegularTriangle triangle = new RegularTriangle(tP,tsideLength);
                                dataOfShapes.add(triangle);
                                break;
                            case "h":
                                Point hP = new Point(x,y);
                                double hsideLength = sideLength;
                                RegularHexagon hexagon = new RegularHexagon(hP,hsideLength);
                                dataOfShapes.add(hexagon);
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }else{
                        throw new IndexOutOfBoundsException();
                    }
                }else{
                    throw new NullPointerException();
                }
                i++;
            }
        }catch(IllegalArgumentException e){
            System.err.println("The data in file is given incorrectly or the file is empty");
            System.exit(0);
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("The number of data in one line is not correct (it should be 4) or the number of data in not correct (it shouuld be the same as the number you added in the first line)");
            System.exit(0);
        }
        catch(NullPointerException e){
            System.err.println("Null Pointer Exception is thrown");
            System.exit(0);
        }
        catch(IOException e){
            System.err.println("An unknown exception occured");
            System.exit(0);
        }
    }
}
