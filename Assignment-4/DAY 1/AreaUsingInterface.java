interface shape {
    double pie = 3.14;
    double getArea(); //by default: public, abstract
}

class Circle implements shape {
    double radius;
    Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return pie * radius * radius;
    }
}

class Rectangle implements shape {
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getArea(){
        return length * breadth;
    }
}

public class AreaUsingInterface {
    public static void main(String[] args) {
        Circle cir = new Circle(10.0);
        Rectangle rect = new Rectangle(10.0, 10.0);
        System.out.println("Area of Circle: "+cir.getArea());
        System.out.println("Area of Rectangle: "+rect.getArea());
    }
}