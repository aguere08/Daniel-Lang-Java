package DanielLangCh5;

import java.util.Scanner;

public class AwhileLoop {

    static Scanner scanner = new Scanner(System.in);


    /**While Loops
     *
     * 5.1 - 5.3
     *
     *
     * pg 160 - 166
     *
     */

    public static void main(String[] args) {
        guessingNUmber();
    }

    static void anotherOne() {

        int sum = 0;
        int i = 1;

        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum is: " + sum);
    }

    static void thisOne() {
        int x = 0;

        while (x < 100) {
            System.out.println("Hello " + x);
            x++;
        }
    }

    static void repeatedAddition() {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        System.out.print("What is " + num1 + " + " + num2 + " ? ");
        int answer = scanner.nextInt();

        while (num1 + num2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + num1 + " + " + num2 + " ? ");
            answer = scanner.nextInt();
        }
        System.out.println("You got it!");
    }

    static void guessingNUmber() {
        int num1 = (int)(Math.random() * 101);

        System.out.println("Guess the magic number between 0 and 100?");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == num1) {
                System.out.println("Yes the number is " + num1);
                break;
            }
            else if (guess > num1)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");

        }

    }
}
