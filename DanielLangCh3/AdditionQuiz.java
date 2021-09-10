package DanielLangCh3;

import java.util.Scanner;

public class AdditionQuiz {
    /**
     * Chapter 3 boolean data types pg 79
     * @param args
     */

    public static void main(String[] args) {
        addQuiz();
    }

    static void addQuiz() {
        //this statement gets the last digit in of the number
        int number1 = (int) (System.currentTimeMillis() % 10);

        //this statement gets the second to last digit
        int number2 = (int) (System.currentTimeMillis() / 10  % 10);

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " ?: ");

        int answer = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
