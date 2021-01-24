package ua.mainacdemy.model;

public class Triangle implements Shape {
    private  double base;
    private  double height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base*height)/2;
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

