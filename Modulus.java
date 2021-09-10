package DanielLangCh2;

import java.util.Scanner;

public class Modulus {
    static Scanner scanner = new Scanner(System.in);


    /**
     * Operator modulus %  yields remainder after division
     * The operand on the left is the dividend and on the right is the divisor
     *
     * 7 % 3 = 1
     * 3 % 7 = 3
     * 12 % 4 = 0
     * 26 % 8 = 2
     * 20 % 13 = 7
     *
     *
     * % can also be used on negative and float type values.
     * (The remainder is negative only if the dividend(left value) is negative)
     *
     * -7 % 3 = -1
     * -12 % 4 = 0
     * -26 % -8 = -2
     * 20 % -13 = 7
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        dayOfTheWeek();

    }

    public static void dayOfTheWeek() {
        int day;
        while (true) {
            System.out.print("Enter day of the week 1 - 7: ");
            day = scanner.nextInt();
            if (day > 0 && day <= 7)
                break;
            System.out.println("Enter value between 1 and 7!");

        }

        System.out.print("If today is ");
        DayOfTheWeek(day);

        System.out.println("What will be the day in 10 days?");
        int meetAfter = scanner.nextInt();


        DayOfTheWeek(day);

    }

    public static void DayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
