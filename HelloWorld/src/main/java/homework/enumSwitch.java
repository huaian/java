package homework;
import homework.Constants;

import java.util.Scanner;

enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
public class enumSwitch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine() ;
        Weekday day = null;
        switch (weekday) {
            case "MON":
                System.out.println("Monday");
                day = Weekday.MON;
                break;
            case "TUE":
                System.out.println("Tuesday");
                day = Weekday.TUE;
                break;
            case "WED":
                System.out.println("Tuesday");
                day = Weekday.TUE;
                break;
            case "THU":
                System.out.println("Thusday");
                day = Weekday.THU;
                break;
            case "FRI":
                System.out.println("Friday");
                day = Weekday.FRI;
                break;
            case "SAT":
                System.out.println("Saturday");
                day = Weekday.SAT;
                break;
            case "SUN":
                System.out.println("Sunday");
                day = Weekday.SUN;
                break;
            default:
                System.out.println("nothing input!");
        }
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.printf("weekend!");
        }
    }
}

