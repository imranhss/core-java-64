
package learnrecursivemethods.methods;


public class GreatestCommonDiviso {

    // Example: gcd(48, 18) = 6
    public  int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
