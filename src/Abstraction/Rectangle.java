package Abstraction;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "-----------" +
                "\nRectangle" +
                "\nheight=" + height +
                "\nwidth=" + width +
                "\nPerimeter: " + getPerimeter();
    }
}
