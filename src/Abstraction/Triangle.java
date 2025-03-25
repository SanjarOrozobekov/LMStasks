package Abstraction;

public class Triangle extends Shape{
    private int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "-----------"+
                "\nTriangle" +
                "\na=" + a +
                "\nb=" + b +
                "\nc=" + c +
                "\nPerimeter: " + getPerimeter();
    }
}
