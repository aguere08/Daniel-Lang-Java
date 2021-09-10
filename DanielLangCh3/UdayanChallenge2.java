package DanielLangCh3;

import java.util.Scanner;

public class UdayanChallenge2 {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Udayan Challenge 2 question 4 and Daniel Lang Ch 3.7 pg 89
     * @param args
     */

    public static void main(String[] args) {
        BMI();
    }

    static void oddOutput() {
        int start = 1;
        int end = 10;

        while (start <= end) {
            if(start % 2 != 0){
                System.out.print(start);

                //Logic to add comma
                if(end % 2 == 0){ //If end is an even number
                    if(start != (end - 1)) { //check to not add , after printing last number
                        System.out.print(", ");
                    }
                } else { //If end is an odd number
                    if(start != end) { //check to not add , after printing last number
                        System.out.print(", ");
                    }
                }
            }
            start++;
        }

    }

    public static void betterBoolean(int count) {
        boolean newLine = count % 10 == 0;
        System.out.println(newLine);

    }

    static void subtractionQuiz() {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2) {
            int hold = number1; // hold = number1
            number1 = number2; // number1 = number2
            number2 = hold;
        }

        System.out.print("What is "+  number1 + " - " + number2 + " ? ");
        int answer = scanner.nextInt();

        System.out.println(number1 + " - " + number2 + " = " + answer + "\nYour answer is "+ (number1 - number2 == answer));
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
