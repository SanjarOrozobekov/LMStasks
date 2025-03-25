package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(),new Shark(),new Eagle(),new Eagle(),new Turtle(),new Turtle()};

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];

        int sharkCount = 0;
        int turtleCount = 0;
        int eagleCount = 0;

        for (Animal animal : animals) {
            if(animal instanceof Shark){
                sharks[sharkCount] = (Shark) animal;
                sharkCount++;
            } else if (animal instanceof Turtle) {
                turtles[turtleCount] = (Turtle) animal;
                turtleCount++;
            } else if (animal instanceof Eagle) {
                eagles[eagleCount] = (Eagle) animal;
                eagleCount++;
            }
            Shark[] finalSharks = new Shark[sharkCount];
            for (int i = 0; i < sharkCount; i++) {
                finalSharks[i] = sharks[i];
            }
            Turtle[] finalTurtles = new Turtle[turtleCount];
            for (int i = 0; i < turtleCount; i++) {
                finalTurtles[i] = turtles[i];
            }
            Eagle[] finalEagles = new Eagle[eagleCount];
            for (int i = 0; i < eagleCount; i++) {
                finalEagles[i] = eagles[i];
            }
            System.out.println("\nSharks:");
            for (Shark shark : finalSharks) {
                shark.attack();
            }
            System.out.println("\nTurtles:");
            for (Turtle turtle : finalTurtles) {
                turtle.swim();
            }
            System.out.println("\nEagles:");
            for (Eagle eagle : finalEagles) {
                eagle.fly();
            }
        }
    }
}
//Animal деген класс тузунуз жана бир метод кошунуз.
//Анын 3 наследнигин тузунуз.
//
//Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
//Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
//instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
//чыгарыныз.
//Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.
