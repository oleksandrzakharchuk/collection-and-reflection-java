package ua.mainacdemy;

import ua.mainacdemy.model.Circle;
import ua.mainacdemy.model.Shape;
import ua.mainacdemy.model.Square;
import ua.mainacdemy.model.Triangle;

import java.util.*;

public class AppHwMimMaxShape {

    public static void main(String[] args) {
        Circle circle1 = new Circle(41);
        Circle circle2 = new Circle(38);

        Square square1 = new Square(23);
        Square square2 = new Square(19);

        Triangle triangle1 = new Triangle(48, 28);
        Triangle triangle2 = new Triangle(34, 11);


       // Set<Shape> shapeSet = new HashSet<>();
        Set<Shape> sortedShapeSet = new TreeSet<>();

        sortedShapeSet.add(circle1);
        sortedShapeSet.add(square1);
        sortedShapeSet.add(triangle1);
        sortedShapeSet.add(circle2);
        sortedShapeSet.add(square2);
        sortedShapeSet.add(triangle2);
        sortedShapeSet.add(circle1);
        sortedShapeSet.add(circle1);
        sortedShapeSet.add(circle1);

        System.out.println("Set size is " + sortedShapeSet.size());

        double maxArea = 0;
        double minArea = Integer.MAX_VALUE;

        Shape minShape = null;
        Shape maxShape = null;

        for (Shape shape : sortedShapeSet) {
            if (maxArea >= shape.getArea()) {
                minArea = shape.getArea();
                maxShape = shape;
            }
            if (maxArea >= shape.getArea()){
                maxArea = shape.getArea();
                maxShape=shape;
            }
        }
        System.out.println("Max shape is " +maxShape.getClass().getSimpleName()+"and has area " );
    }
}







