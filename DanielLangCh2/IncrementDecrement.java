package DanielLangCh2;

public class IncrementDecrement {

    /**
     * Increment and Decrement
     *
     * Listing 2.15  pg 57
     *
     * PreIncrement
     * ++i - increment i by 1 and use the new i value in the statement
     * &
     * --i - decrement i by 1 and use the new i value in the statement
     *
     *
     *
     *PostIncrement
     * i++  - increment i by 1 but use the original i value in the statement
     * &
     * i--  - Decrement i by 1 and use the original i value in the statement
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        int i = 5;
        int y = 10;
        int x = 20;
        int a = 31;


        System.out.println(" i = " + ++i + "\n y = " + --y + "\n x = " + x++ + "\n a = " + a--);
    }
}
