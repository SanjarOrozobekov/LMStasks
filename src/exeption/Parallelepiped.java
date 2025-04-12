package exeption;

public class Parallelepiped {
    private int height;
    private int length;
    private int width;

    public Parallelepiped() {
    }

    public Parallelepiped(int height, int length, int width) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Бардык параметрлер оң сан болушу керек!");
        }
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void areaParallel(){
       int areaPar = 2*((height * length) + (length * width) + (height * width));
        System.out.println("Паралельипеддин аянты: " + areaPar);
    }

    public void volumeParallel(){
        int volParalell = (length*width*height);
        System.out.println("Паралельипеддин көлөмү: " + volParalell);
    }
}
