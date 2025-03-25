package Abstraction;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(6), new Pentagon(2), new Triangle(3,6,7),
                new Rectangle(7,8), new Square(5)};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
//public abstract double getPerimeter()
//деген абстракт методун  Shape деген класска кошунуз.
//Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.