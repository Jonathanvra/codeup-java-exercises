package shapes;

public class Square extends Rectangle{

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        System.out.println("The perimeter is: ");
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
