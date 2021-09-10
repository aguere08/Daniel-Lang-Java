package DanielLangCh3;

import java.util.Scanner;

public class CaseStudy3 {

    static Scanner scanner = new Scanner(System.in);

    /**Case Study Ch 3
     * pg 99 Leap year
     *
     * Ch3.13 pg 103 - 104 Chinese Zodiac
     *
     * @param args
     */

    public static void main(String[] args) {
        chineseZodiac();
    }

    static void leapYear() {
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + isLeapYear);
    }

    public static void chineseZodiac() {
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();


        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
        }
    }
}
