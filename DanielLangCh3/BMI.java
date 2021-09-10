package DanielLangCh3;

import java.util.Scanner;

public class BMI {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    static void BMI() {
        System.out.print("Enter your weight in pounds: ");
        double pounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double inches = scanner.nextDouble();

        final double Kilos_Per_Pound = 0.45359237;
        final double Meters_Per_Inch = 0.0254;

        double kilos = pounds * Kilos_Per_Pound;
        double meters = inches * Meters_Per_Inch;


        double BMI = kilos / Math.pow(meters,2);

        System.out.printf("Your BMI is: %.2f", BMI);
        System.out.println();

        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        else if (BMI < 25) {
            System.out.println("Normal");
        }
        else if (BMI < 30) {
            System.out.println("Overweight");
        }
        else
            System.out.println("Obese");
    }
}
