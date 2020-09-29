class Area {
    double length, breadth;
    Area() {
        this.length = 0.0;
        this.breadth = 0.0;
    }

    // parameterized constructor
    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return this.length*this.breadth;                
    }

    public String toString() {
        return "Area: " + getArea();
    }
}

class Volume extends Area {
    double height;
    Volume() {
        super();
        this.height = 0.0;
    }
    // parameterized constructor
    Volume(double length, double breadth, double height) {
        super(length,  breadth);
        this.height = height;
    }

    double getVolume() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return String.valueOf(super.toString()) + "\n" + "Volume: " + getVolume();
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Volume box = new Volume(10.0,10.0,30.0);
        System.out.println(box);
    }
}
