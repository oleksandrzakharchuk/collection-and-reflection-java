package ua.mainacdemy;


import ua.mainacdemy.model.Circle;
import ua.mainacdemy.model.Triangle;
import ua.mainacdemy.model.Square;

public class Application {
    public static void main(String[] args) {
        Circle circle =  new Circle(15);
        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(30);
        Circle circle3 = new Circle(40);

        Square square=new Square(15);
        Square square1=new Square(20);
        Square square2=new Square(30);
        Square square3=new Square(40);

        Triangle triangle=new Triangle(15,10);
        Triangle triangle1=new Triangle(15,20);
        Triangle triangle2=new Triangle(15,30);
        Triangle triangle3=new Triangle(15,40);

    }
}


