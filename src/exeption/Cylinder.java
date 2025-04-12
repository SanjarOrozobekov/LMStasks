package exeption;

public class Cylinder {
    private final double PI = 3.14;
    private int radius;
    private int height;

    public Cylinder() {
    }

    public Cylinder(int radius, int height) {
        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Радиус жана бийиктик оң сандар болушу керек!");
        }
        this.radius = radius;
        this.height = height;
    }

    public void areaCylinder(){
            double areaCylinder = 2 * PI * radius * (height + radius);
            System.out.println("Цилиндрдин аянты: " + areaCylinder);
    }
    public void volumeCilinder(){
        double volumeCilinder = (PI*radius*radius*height);
        System.out.println("Цилиндрдин көлөмү: " + volumeCilinder);
    }
}
