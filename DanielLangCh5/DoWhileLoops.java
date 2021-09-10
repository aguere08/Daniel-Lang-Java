package DanielLangCh5;

import java.util.Scanner;

public class DoWhileLoops {
    static Scanner scanner = new Scanner(System.in);

    /** Do while loop  Ch 5 pg 173
     *
     */

    public static void main(String[] args) {
        numberMax();
    }

    static void restartDoWhile() {
        int count = 0;
        do {
            System.out.println("Welcome to Java");
            count++;
        }while (count < 100);

    }

    static void testDoWhile() {
        int data;
        int sum = 0;

        do {
            System.out.print("Enter an integer and type 0 to end program: ");
            data = scanner.nextInt();

            sum += data;
        }while (data != 0);

        System.out.println("The sum is: " + sum);
    }

    static void numberMax() {
        int number;
        int max;

        number = scanner.nextInt();
        max = number;

        do {
            number = scanner.nextInt();
            if (number > max){
                max = number;
            }
        } while (number != 0);

        System.out.println("max is: " + max);
        System.out.println("number is: " + number);
    }

}
