interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Square implements Shape {
    double side;

    Square(double s) {
        side = s;
    }

    public double calculateArea() {
        return side * side;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape s = new Square(4);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Square Area: " + s.calculateArea());
    }
}
