package DanielLangCh4;

import java.util.Locale;
import java.util.Scanner;

public class StringType {

    static Scanner scanner = new Scanner(System.in);

    /**
     * String Type Ch 4
     * starts pg 131
     *
     * the data type String is used to represent a string of characters.
     *
     * String is known as a reference type. Any java class can be used as a reference type for a variable.
     * The variable declared by a reference type is known as a reference variable that references an object.
     *
     * String message = "Welcome to Java";
     *
     * message - is a reference variable that references a string object with the contents "Welcome to Java";
     *
     *
     * Strings are objects in Java. methods in String class are considered instance methods as they need an
     * object to be invoked.
     *
     * Unlike those methods in Math class that don't require an object they are known as static methods
     *
     *
     */

    public static void main(String[] args) {
        String message = "Welcome to Java ";
        String s1 = "Apples";

        System.out.println(message.length());
        System.out.println(message.charAt(5));
        System.out.println(message.concat(s1));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.trim());

        System.out.println("Welcome".length());
    }

    /**
     * Reading String from Console
     * pg 134
     * when we use the scanner class we use .next() to read a string value
     * limitation to this method is it only reads a string value up to the first whitespace
     *
     * We use method nextLine() to read the entire line. until the enter key is pressed
     *
     * to read a character from a console we will use the .nextLine() method and then invoke a charAt() to return char
     * use code below
     *
     */
    static void readingStringConsole() {
        System.out.print("Enter a character: ");
        String s = scanner.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);



    }
}
