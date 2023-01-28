import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("""
                    To enable [on]:\s
                    To turn off [off]:\s
                    """);
            String tv = new Scanner(System.in).nextLine().toUpperCase();
            switch (tv) {
                case "ON" -> tvOn("Hello");
                case "OFF"-> {

                }
            }
            break;
        }
    }

    static void tvOn(String on) {
        System.out.println(on);
        LocalDate localDate = LocalDate.now();
        System.out.println("Date: " + localDate + """
                                 
                |----------------------------------------|
                |                  MENU                  |
                |-------------------|--------------------|
                |  1-KTRK           | 6-CineMax          |
                |  2-Fox News       | 7-Kino  Premiere   |
                |  3-NBA            | 8-PEH TB           |
                |  4-Kino 312       | 9-BBC              |
                |  5-TNT            | 10-KTRK Ala-Too24  |
                |-------------------|--------------------|
                 """);
        Scanner scanner = new Scanner(System.in);
        int n1=10;
        int num=1;

        while (true) {
            if(num==11){
                num=1;
            } else if (num==1) {
                num=n1;
            }
            String plus = scanner.nextLine();
            switch (plus) {
                case "+" -> channelTvPlus(num++);
                case "-" -> channelTvMinus(num--);
                case "1"-> System.out.println("1.KTRK");
                case "2" -> System.out.println("2.Fox News ");
                case "3" -> System.out.println("3.NBA");
                case "4" -> System.out.println("4.Kino 312");
                case "5" -> System.out.println("5.TNT");
                case "6" -> System.out.println("6.CineMax");
                case "7" -> System.out.println("7.Kino  Premiere");
                case "8" -> System.out.println("8.PEH TB");
                case "9" -> System.out.println("9.BBC");
                case "10" -> System.out.println("10.KTRK Ala-Too24");
                case "off" -> {
                    System.out.println("TV off!");

                }

            }
            break;
        }

    }
    static int channelTvPlus(int num) {
        switch (num) {
            case 1 -> System.out.println("1.KTRK");
            case 2 -> System.out.println("2.Fox News ");
            case 3 -> System.out.println("3.NBA");
            case 4 -> System.out.println("4.Kino 312");
            case 5 -> System.out.println("5.TNT");
            case 6 -> System.out.println("6.CineMax");
            case 7 -> System.out.println("7.Kino  Premiere");
            case 8 -> System.out.println("8.PEH TB");
            case 9 -> System.out.println("9.BBC");
            case 10 -> System.out.println("10.KTRK Ala-Too24");
        }
        return num;
    }
    static int channelTvMinus(int num){
        --num;
        switch (--num) {
            case 1 -> System.out.println("1.KTRK");
            case 2 -> System.out.println("2.Fox News ");
            case 3 -> System.out.println("3.NBA");
            case 4 -> System.out.println("4.Kino 312");
            case 5 -> System.out.println("5.TNT");
            case 6 -> System.out.println("6.CineMax");
            case 7 -> System.out.println("7.Kino  Premiere");
            case 8 -> System.out.println("8.PEH TB");
            case 9 -> System.out.println("9.BBC");
            case 10 -> System.out.println("10.KTRK Ala-Too24");
        }
        return num;
    }
}
