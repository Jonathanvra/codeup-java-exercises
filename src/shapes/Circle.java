package shapes;

import util.Input;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("This is the radius for our circle:");
        Circle circle = new Circle(input.getDouble());
        System.out.printf("The circle's area: %f; Circle's circumference: %f.%n", circle.getArea(), circle.getCircumference());
    }
}
