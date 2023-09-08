/* Задания на практическую работу № 4.1
Задания на абстрактные классы
Перепишите суперкласс Shape из задания 1, сделайте его
абстрактным и наследуйте подклассы, так как это представлено на UML
диаграмме на рис. 4.1.1 Circle, Rectangle и Square.  */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Circle class test
        Circle circle = new Circle(0, "black", true);
        System.out.println("Enter radius: ");
        int radius_circle = in.nextInt();
        circle.set_radius(radius_circle);
        System.out.println("Enter color: ");
        String color_circle = in.nextLine();
        circle.set_color(color_circle);
        System.out.println(circle);

        // Rectangle class test
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter length: ");
        int length_rect = in.nextInt();
        rectangle.set_length(length_rect);
        System.out.println("Enter width: ");
        int width_rect = in.nextInt();
        rectangle.set_width(width_rect);
        System.out.println("Rectanle area: " + rectangle.get_area());
        System.out.println(rectangle);

        // Square class test
        Square square = new Square(10, "white", false);
        square.set_side(11);
        System.out.println(square);
    }
}

abstract class Shape {
    private String color;
    private boolean filled;

    Shape() {
        System.out.println("\nShape object was created");
    }

    // Color getter
    String get_color() {
        return this.color;
    }

    // Color setter
    void set_color(String color) {
        this.color = color;
        System.out.println("Shape color setted as: " + this.color);
    }

    // Filled getter
    boolean is_filled() {
        return this.filled;
    }

    // Filled getter
    void set_filled(boolean filled) {
        this.filled = filled;
        System.out.println("Shape filledness setted as: " + this.filled);
    }

    // Area getter
    double get_area() {
        return 0.0;
    }

    // Perimetr getter
    double get_perimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape object: is filled: " + this.filled + ", color: " + this.color;
    }
}

class Circle extends Shape {
    protected double radius;

    Circle(double radius, String color, boolean filled) {
        super.set_color(color);
        super.set_filled(filled);
        this.radius = radius;
        System.out.println("Circle object was created");
    }

    // Radius getter
    double get_radius() {
        return this.radius;
    }

    // Radius setter
    void set_radius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Circle radius setted as: " + this.radius);
        } else {
            System.out.println("Circle radius must be > 0");
        }
    }

    @Override
    double get_area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double get_perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle, radius: " + this.radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        super.set_color("blue");
        super.set_filled(false);
        this.width = get_width();
        this.length = get_length();
        System.out.println("Rectangle object was created");
    }


    // Width getter
    double get_width() {
        return this.width;
    }

    // Width setter
    void set_width(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Rectangle width setted as: " + this.width);
        } else {
            System.out.println("Rectangle width must be > 0");
        }
    }

    // Length getter
    double get_length() {
        return this.length;
    }

    // Width setter
    void set_length(double length) {
        if (length > 0) {
            this.length = length;
            System.out.println("Rectangle length setted as: " + this.length);
        } else {
            System.out.println("Rectangle length must be > 0");
        }
    }

    @Override
    double get_area() {
        return this.length * this.width;
    }

    @Override
    double get_perimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width;
    }
}

class Square extends Rectangle {


    Square(double side, String color, boolean filled) {
        super.set_color("blue");
        super.set_filled(false);
        this.width = side;
        this.length = side;
        System.out.println("[+] Square object was created");
    }

    // Side getter
    double get_side() {
        return this.width;
    }

    // Side setter
    void set_side(double side) {
        if (side > 0) {
            this.width = side;
            this.length = side;
            System.out.println("Square side setted as: " + this.width);
        } else {
            System.out.println("Square side must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: square, side: " + this.width;
    }
}