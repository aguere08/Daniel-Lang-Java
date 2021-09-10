package DanielLangCh5;

import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);

    /**
     *
     */

    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        int number = (int)(Math.random() * 101);

        System.out.println("Please guess the number between 0 and 100: ");

        int guess = -1;


        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("number is " + number);
                break;
            }
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is to low.");

        }
    }

}
