package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Write day: ");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Monday")){
                System.out.println(Days.MONDAY);
            } else if (choice.equalsIgnoreCase("Tuesday")) {
                System.out.println(Days.TUESDAY);
            }else if (choice.equalsIgnoreCase("Wednesday")) {
                System.out.println(Days.WEDNESDAY);
            }else if (choice.equalsIgnoreCase("Thursday")) {
                System.out.println(Days.THURSDAY);
            }else if (choice.equalsIgnoreCase("Friday")) {
                System.out.println(Days.FRUDAY);
            }else if (choice.equalsIgnoreCase("Saturday")) {
                System.out.println(Days.SATURDAY);
            }else if (choice.equalsIgnoreCase("Sunday")) {
                System.out.println(Days.SUNDAY);
            }else
                System.out.println("Error!");
        }
    }

//Күндөргө enum түзүңүз (Monday, Tuesday ...)
//Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда
// "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда "Шейшемби күнү
// англис тили сабагын окуйм" деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
//Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.
