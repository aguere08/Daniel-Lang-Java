package DanielLangCh5;

public class ForSureLoop {

    /**For Loop Continuation
     * Ch 5 pg 175 - 178
     */

    public static void main(String[] args) {
        tryOne();
        tryTwo();
    }

    static void tryOne() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
    static void tryTwo() {
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);

    }
}
