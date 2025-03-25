package Modifiers;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area: " + PI * (radius * radius));
    }
    public void circumference(){
        System.out.println("Circumference: " + PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius;
    }
}
