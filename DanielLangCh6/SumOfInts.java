package DanielLangCh6;


/**
 * Intro To Methods Ch 6
 */

public class SumOfInts {
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 = " + sum(1, 10));
        System.out.println("Sum from 20 to 37 = " + sum(20, 37));
        System.out.println("Sum from 35 to 49 = " + sum(35, 49));
    }

    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;
        return result;
    }

}
