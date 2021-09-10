package DanielLangCh4;

public class MinMax {

    /**
     * The min Max and abs Methods
     * pg 124
     *
     * the min and max methods return the min and max of two numbers.
     * (int, long, float, double)
     *
     * abs method returns absolute value of the number(int, long, float, double )
     *
     */

    public static void main(String[] args) {
        Math.max(2, 3); // returns 3
        Math.min(2.5, 4.6); //returns 2.5
        Math.max(Math.max(2.5, 4.6) , Math.min(3, 5.6)); // returns 4.6
        Math.abs(-2);// returns 2
        Math.abs(-2.1); // returns 2.1
    }
}
