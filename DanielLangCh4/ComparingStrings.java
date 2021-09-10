package DanielLangCh4;

import java.util.Scanner;

public class ComparingStrings {

    static Scanner scanner = new Scanner(System.in);

    /**Comparing Strings
     *
     * equals(s1)  returns true if this string is equal to s1
     *
     * equalsIgnoreCase(s1) returns true if this string is equal to s1: it is case insensitive
     *
     * compareTo(s1)  returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is
     * greater than, equal to, or less than s1
     *
     * CompareToIgnoreCase(s1)  same to compareTo() except this method is case insensitive
     *
     * startsWith(prefix) returns true if this string starts with the specified prefix
     *
     * endsWith(suffix)   returns true if this string ends with the specified suffix
     *
     * contains(s1)  returns returns true if s1 is a substring in this string
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        orderTwoCities();
    }

    static void checkEqualString() {
        String str1 = "Apples";
        String str2 = "Apple";
        if (str1.equals(str2))
            System.out.println("str1 and str2 have the same contents");
        else
            System.out.println("str1 and str2 are not equal");

    }

    static void stringMethods() {
        System.out.println("Welcome to Java".startsWith("We"));// true
        System.out.println("Welcome to Java".startsWith("we"));// false
        System.out.println("Welcome to Java".endsWith("va"));// true
        System.out.println("Welcome to Java".endsWith("v"));// false
        System.out.println("Welcome to Java".contains("to"));// true
        System.out.println("Welcome to Java".contains("To"));//false
    }

    static void orderTwoCities() {
        //Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are :" + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are :" + city2 + " " + city1);



    }
}
