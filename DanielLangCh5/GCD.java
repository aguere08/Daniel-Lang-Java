package DanielLangCh5;

import java.util.Scanner;

public class GCD {
    static Scanner scanner = new Scanner(System.in);

    /**
     *
     */

    public static void main(String[] args) {
        greatestCommonDivisor();
    }

    static void greatestCommonDivisor() {
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        int gcd = 1; // initial gcd

        int k = 2; // Possible gcd

        while (k <= firstNumber && k <= secondNumber) {
            if (firstNumber % k == 0 && secondNumber % k == 0 )
                gcd = k;
            k++;
        }
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + gcd);

    }

    static void example1() {
        double tuition = 10_000;

        int year = 0;

        while (tuition < 20_000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years.");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}
