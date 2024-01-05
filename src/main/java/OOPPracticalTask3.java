import java.util.Random;

abstract class Shape {
    String name;
    int[] coordinates;

    public Shape(String name, int[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, int[] coordinates, double radius) {
        super(name, coordinates);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(String name, int[] coordinates, double side) {
        super(name, coordinates);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, int[] coordinates, double base, double height) {
        super(name, coordinates);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class OOPPracticalTask3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            int[] coordinates = {random.nextInt(100), random.nextInt(100)};
            String name = "";

            switch (shapeType) {
                case 0:
                    name = "Circle";
                    shapes[i] = new Circle(name, coordinates, random.nextDouble() * 10);
                    break;
                case 1:
                    name = "Square";
                    shapes[i] = new Square(name, coordinates, random.nextDouble() * 10);
                    break;
                case 2:
                    name = "Triangle";
                    shapes[i] = new Triangle(name, coordinates, random.nextDouble() * 10, random.nextDouble() * 10);
                    break;
            }
        }

        // Sort shapes by area
        for (int i = 0; i < shapes.length - 1; i++) {
            for (int j = i + 1; j < shapes.length; j++) {
                if (shapes[i].getArea() > shapes[j].getArea()) {
                    Shape temp = shapes[i];
                    shapes[i] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }

        // Display the sorted array
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ", S=" + shape.getArea());
        }
    }
}
