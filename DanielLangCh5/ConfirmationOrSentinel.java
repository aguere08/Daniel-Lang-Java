package DanielLangCh5;

import java.util.Scanner;

public class ConfirmationOrSentinel {

    static Scanner scanner = new Scanner(System.in);

    /** Sentinel Values  Ch 5 pg 169
     *
     * @param args
     */

    public static void main(String[] args) {
        tryOuts();
    }

    static void loopContinue() {
//        char continueLoop = 'Y';
//        int x = 0;
//        while (continueLoop == 'Y') {
//            System.out.print("We are running through the loop " + x + " times.");
//            x++;
//
//            System.out.print("Enter Y to continue and N to quit: ");
//            continueLoop = scanner;
//        }
    }

    static void sentinelValue() {
        System.out.print("Enter an integer type 0 to end: ");
        int data = scanner.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;

            System.out.print("Enter an integer type 0 to end: ");
            data = scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
    }

    static void tryOuts() {
        System.out.print("Enter a number and type 0 to end program: ");
        int data = scanner.nextInt();


        int sum = 0;
        while (data != 0) {
            sum += data;

            System.out.print("Enter a number and type 0 to end program: ");
            data = scanner.nextInt();
        }
        System.out.println("The sum of your input is: " + sum);
    }
}
