package DanielLangCh4;

public class TrigonometricMethods {

    /**
     * Trigonometric Methods ch 4
     *
     * pg 123
     *
     * sin(radians)  returns trigonometrical sine of an angel in radians
     * cos(radians)  returns trigonometric cosine of an angle in radians
     * tan(radians)  returns trigonometric tangent of an angle in radians
     * toRadians(degree) returns angle in radians for angle in degrees
     * toDegrees(radians) returns the angle in degrees for angle in radians
     * asin(a)      returns the angle in radians for the inverse of sine
     * acos(a)      returns the angle in raidans for the inverse of cosine
     * atan(a)      returns the angle in radians for the inverse of tangent
     *
     *
     *
     */

    public static void main(String[] args) {

    }

    static void trigonometric() {
        Math.sin(Math.toRadians(270)); // returns -1.0
        Math.sin(Math.PI / 6); // returns 0.5
        Math.sin(Math.PI / 2); // returns 1.0
        Math.cos(0);// returns 1.0
        Math.cos(Math.PI / 6);// returns 0.866
        Math.cos(Math.PI / 2);//returns 0
        Math.asin(0.5); // returns 0.523598333 same as PI/6
        Math.acos(0.5); // returns 1.0472 (same as PI / 3)
        Math.atan(1.0); // returns 0.785398
    }
}
