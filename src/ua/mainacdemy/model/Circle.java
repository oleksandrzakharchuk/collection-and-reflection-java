package ua.mainacdemy.model;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Object o) {
        Shape obj = (Shape) o;
        if (this.getArea() < obj.getArea()) {
            return -1;
        } else if (this.getArea() > obj.getArea()) {
            return 1;
        } else {
            return 0;
        }
       // Shape obj = (Shape) o;
        //return Double.compare(this.getArea(), obj.getArea());
    }
}

