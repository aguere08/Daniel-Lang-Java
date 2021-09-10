package DanielLangCh4;

import java.util.Scanner;

public class ConversionBetweenStringsAndNumbers {
    static Scanner scanner = new Scanner(System.in);


    /**Conversion Between Strings and Numbers
     *
     * convert a numeric string into a number
     * to convert an int vale use the Integer.parseInt()
     *
     */

    public static void main(String[] args) {
        convertStringToDouble();
    }

    static void convertStringToInt() {
        System.out.print("Enter a whole number no decimals: ");
        String numInt = scanner.nextLine();

        int intValue = Integer.parseInt(numInt);

        System.out.println(intValue + 45);
    }

    static void convertStringToDouble() {
        System.out.print("Enter a number: ");
        String numDouble = scanner.nextLine();

        double doubleValue = Double.parseDouble(numDouble);

        System.out.println(doubleValue + 45);
    }
}
