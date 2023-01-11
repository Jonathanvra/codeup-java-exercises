package shapes;

import util.Input;
public class Rectangle{
    protected double width;
    protected double height;
    public Rectangle(double width, double height) {
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
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println("The area of the rectangle is " + rectangle.getArea());
    }
}
