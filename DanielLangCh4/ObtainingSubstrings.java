package DanielLangCh4;

public class ObtainingSubstrings {
    /**Obtain Substrings
     *
     * obtain a single character from a string using charAt() and
     * you can also use the substring()
     *
     *         String message = "Welcome to Java";
     *         message = message.substring(0,11) + "HTML.";
     *
     *         System.out.println(message);
     *
     *
     *substring(beginIndex)  returns this substring that begins with the character at the specified beginIndex to the end
     * of the string
     *
     * substring(beginIndex, endIndex)
     *
     *              0   1   2   3   4   5   6   7   8   9   10  11  12  13  14
     *              W   e   l   c   o   m   e       t   o       J   a   v   a
     */

    public static void main(String[] args) {
        theIndexOf();
    }

    static void rise() {
        String message = "Welcome to Java";
        message = message.substring(0,11) + "HTML.";

        System.out.println(message);
    }

    static void theIndexOf() {
        String name = "Rene Aguero";
        int k = name.indexOf(' ');
        String firstName = name.substring(0, k);
        String lastname = name.substring(k + 1);

        System.out.println("The first name is: " + firstName);
        System.out.println("The last name is: " + lastname);
    }
}
