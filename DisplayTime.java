package DanielLangCh2;

import java.util.Scanner;

public class DisplayTime {

    /**
     * Chapter 2
     * Listing 2.5 Displaying Time
     *
     * obtains minutes and remaining seconds
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer in seconds: ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
