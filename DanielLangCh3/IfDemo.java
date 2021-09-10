package DanielLangCh3;

import java.util.Scanner;

public class IfDemo {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Chapter 3, section 3
     * If statements
     *
     * pg 81
     * @param args
     */


    public static void main(String[] args) {
        example1(30);
        System.out.println();
        example2(30);
    }

    static void simpleIfDemo() {
        System.out.print("Enter an integer: ");
        int value = scanner.nextInt();
        if (value % 5 ==0)
            System.out.println("HiFive");
        if (value % 2 == 0)
            System.out.println("HiEven");
    }

    //3.3.1 on pg 82
    static void problem2() {
        int x = 0;
        int y = 0;
        if (y > 0) {
            x = 1;
        }
        System.out.println(x);
    }

    static void example1(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else
            System.out.println(number + " is odd");
    }

    static void example2(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");

        System.out.println(number + " is odd");
    }
}
