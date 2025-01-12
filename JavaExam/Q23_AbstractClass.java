abstract class Shape {
    protected double base;
    protected double height;

    public Shape(double dimension1, double dimension2) {
        this.base = dimension1;
        this.height = dimension2;
    }

    public abstract double area();
}

class Rectangle extends Shape {

    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    public double area() {
        return base * height;
    }
}

class Triangle extends Shape {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}


public class Q23_AbstractClass {
    public static void main(String[] args) {
       
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + rectangle.area());

        
        Shape triangle = new Triangle(6, 8);
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
