package DanielLangCh6;

import java.util.Scanner;

public class PrintCalendar {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Prompt the user to enter the year
        System.out.print("Enter full year (eg.. 2012): ");
        int year = scanner.nextInt();

        //Prompt user to enter the month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = scanner.nextInt();

        //print calendar for the month and year
        printMonth(year, month);
    }

    //A stub for printMonth may loo like this
    public static void printMonth(int year, int month) {
        System.out.println(month + " " + year);
    }



}
