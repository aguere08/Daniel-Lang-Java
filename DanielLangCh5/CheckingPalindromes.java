package DanielLangCh5;

import java.util.Scanner;

public class CheckingPalindromes {
    static Scanner scanner = new Scanner(System.in);

    /**Checking Palindromes
     * pg 189 - 190
     *
     * A string is a palindrome if it reads the same forward or backward.
     * Examples: mom, dad, noon
     *
     */

    public static void main(String[] args) {

        //Prompt user for String
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        //the index of the first character in the string
        int low = 0;

        // the index of the last character in the string
        int high = word.length() - 1;

        boolean isPalindrome = true;

        while (low < high) {
            if (word.charAt(low) != word.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(word + " is a palindrome.");
        else
            System.out.println(word + " is not a palindrome.");

    }
}
