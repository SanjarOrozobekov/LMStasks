package Abstraction;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "---------" +
                "\nSquare" +
                "\nside=" + side +
                "\nPerimeter" + getPerimeter();
    }
}
