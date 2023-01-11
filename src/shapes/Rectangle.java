package shapes;

import util.Input;
public class Rectangle{
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
//  Todo getPerimeter
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
// Todo getArea
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Let's get a radius for our circle:");
        Rectangle rectangle = new Rectangle(input.getInt());
        System.out.printf("The perimeter of the rectangle is %f; The area of a rectangle is %f.%n", Rectangle.getPerimeter(), Rectangle.getArea());
//        System.out.printf("Circle's area: %f; Circle's circumference: %f.%n", Rectangle.getPerimeter(), Rectangle.getArea());
    }
}
