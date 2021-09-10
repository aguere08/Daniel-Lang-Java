package DanielLangCh5;

public class TestingBreakContinue {
    /**
     * Break and Continue  pg 187 - 189
     *
     *
     * The break statement breaks out of the innermost loop , which contains the break
     *
     * the continue statement only ends the current iteration
     *
     */

    public static void main(String[] args) {
        testingContinue();
    }

    static void testingBreak() {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            System.out.println("For number " + number + " sum is " + sum);
            number++;
            sum += number;

            if (sum >= 100)
                break;
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }

    static void testingContinue() {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            System.out.println("For number " + number + " sum is " + sum);
            number++;
            if (number == 10 || number == 11)
                continue;

            sum += number;

        }
        System.out.println("The sum is " + sum);
    }
}
