package ua.mainacdemy.model;

public class Square implements Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public int compareTo(Object o) {
        /*Shape obj = (Shape) o;
        if (this.getArea() < obj.getArea()) {
            return -1;
        } else if (this.getArea() > obj.getArea()) {
            return 1;
        } else {
            return 0;
        }*/
        Shape obj = (Shape) o;
        return Double.compare(this.getArea(), obj.getArea());
    }
}

