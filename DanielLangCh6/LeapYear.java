package DanielLangCh6;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class LeapYear {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Leap year equation
     */

    public static void main(String[] args) {
        System.out.print("Enter a year to see if it is a leap year: ");
        int year = scanner.nextInt();

        System.out.println("Is the year " + year + " a leap year ? " + isLeapYear(year));

    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
