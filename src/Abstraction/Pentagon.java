package Abstraction;

public class Pentagon extends Shape{
    private int side;

    public Pentagon(int side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 5*side;
    }

    @Override
    public String toString() {
        return "-----------"+
                "\nPentagon" +
                "\nside=" + side +
                "\nPerimeter: " + getPerimeter();
    }
}
