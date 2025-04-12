package exeption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue){
            try{
                System.out.println("""
                         --- Фигура тандаңыз ---
                          1. Цилиндр
                          2. Параллелепипед
                          3. Чыгуу""");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Радиусту жана бийиктикти жаз: ");
                        Cylinder cylinder = new Cylinder(scanner.nextInt(), scanner.nextInt());
                        cylinder.areaCylinder();
                        cylinder.volumeCilinder();
                        break;
                    case 2:
                        System.out.println("Узунун,туурасын жана бийиктигин жаз: ");
                        Parallelepiped parallelepiped = new Parallelepiped(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                        parallelepiped.areaParallel();
                        parallelepiped.volumeParallel();
                        break;
                    case 3:
                        isTrue = false;
                        break;
                    default:
                        System.out.println("Туура эмес тандоо!");
                }
            }catch (NumberFormatException e){
                System.out.println("Сан гана жаз.");
            }
        }
    }
}
//Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
//Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
//берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//Мумкун болгон каталар:
//        1) берилген маалымат терс сан болсо
//       2) берилген маалымат сан эмес тамга болсо
//       3) жана озунуздор берген кошумча каталар болсо да болот
//Параллелепипед:
//        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//        -Формулалар Parallelepiped классында жазылуусу керек
//Цилиндр:
//        - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
//        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
//        -Формулалар Cylinder классында жазылуусу керек
//Бардык Exception дор логикасы main класста жазылcын
//Бардык маалмыттар консоль аркылуу берилсин
//Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.