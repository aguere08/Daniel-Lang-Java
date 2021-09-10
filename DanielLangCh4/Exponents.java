package DanielLangCh4;

public class Exponents {

    /**Exponent Methods ch 4
     * pg 123
     *
     * exp(x)       returns e raised to power of x(e^x)
     * log(x)       returns the natural logarithm of x (ln(x) = log e(x))
     * log10(x)     returns the base 10 logarithm of x (log 10 (x))
     * pow(a,b)     returns a raised to the power of b(a^b)
     * sqrt(x)      returns the square root of x (\/--x) for x >=0
     *
     */

    public static void main(String[] args) {

    }

    static void exponents() {
        Math.exp(3.5); //returns 33.11545
        Math.log(3.5); // returns 1.25276
        Math.log10(3.5); // returns 0.544
        Math.pow(2,3); // returns 8
        Math.pow(3,2); // returns 9.0
        Math.pow(4.5,2.5); //returns 42.9567
        Math.sqrt(4); // returns 2.0
        Math.sqrt(10.5); //returns 3.24
    }
}
