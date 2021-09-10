package DanielLangCh5;

import java.util.Scanner;

public class SubtractionQuizLoop {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Listing 5.4
     *
     * pg 166 - 167
     */

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // number of questions

        int correctCount = 0; // number of correct answers

        int count = 0;// count the number of questions

        long startTime = System.currentTimeMillis();

        String output = " ";// output string is initially empty


        while (count < NUMBER_OF_QUESTIONS) {
            //1. generate two random single digit integers
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            //2. If number < number 2 swap number 1 with number2
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            //3. Prompt he student to answer "What is number 1 - number 2?
            System.out.print("What is " + num1 + " - " + num2 + " ?: ");
            int answer = scanner.nextInt();


            //4. Grade the answer and display the result
            if (num1 - num2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong.\n" + num1 + " - " + num2 + " should be: " + (num1 - num2));

            //increase the question count
            count++;

            output += "\n" + num1 + " - " + num2 + " = " + answer +
                    ((num1 - num2 == answer) ? "correct" : "wrong");
        }


            long endTime = System.currentTimeMillis();
            long testime = endTime - startTime;

            long timeInMin = (testime/ 1000) / 60;
            long timeInSec = (testime / 1000) % 60;

            System.out.println("Correct count is " + correctCount + "\nTest time is " + timeInMin + " minutes " +
                    timeInSec + " seconds");

    }

}
