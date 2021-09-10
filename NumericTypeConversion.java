package DanielLangCh2;

import java.util.Scanner;

public class NumericTypeConversion {

    /** Numeric Type Conversion
     *
     * Using explicit casting
     *
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchased amount: ");
        double purchaseAmount = scanner.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

    }
}
