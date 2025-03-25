package Modifiers;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Write radius: ");
        Circle circle = new Circle(new Scanner(System.in).nextDouble());
        System.out.println(circle.toString());
        circle.area();
        circle.circumference();
    }
}
//Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//жана circumference деген статик методдору болсун.
//areaны табуу учун: PI * (radius * radius)
//circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат