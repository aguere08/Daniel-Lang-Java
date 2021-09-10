package DanielLangCh2;

import java.util.Scanner;

public class Projects {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        sumDigits();
    }

    public static void convertCelsiusToFahrenheit() {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 9.0 / 5 * celsius + 32;

        System.out.println(celsius +  " degrees celsius is " + fahrenheit + " fahrenheit");
    }

    public static void volumeOfCylinder() {
        // area = radius * radius * PI
        //volume = area * length

        System.out.print("Enter the radius of cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;

        double volume = area * length;

        System.out.printf("The area is %.4f", area);
        System.out.println();
        System.out.printf("The volume is %.1f", volume);


    }

    public static void sumDigits() {
        System.out.print("Enter a number between 0 and 1000: ");
        int value;
        while (true) {
            value = scanner.nextInt();
            if (value > 0 && value < 1000)
                break;

            System.out.print("Value must be between 0 and 1000: ");

        }
        int hundreth = value / 100;
        int tenth = value / 10 % 10;
        int one = value % 10;


        int sum = hundreth + tenth + one;

        System.out.println(hundreth);
        System.out.println(tenth);
        System.out.println(one);

        System.out.println("The sum of number entered " + value + " is " + sum);


    }
}
