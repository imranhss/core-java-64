package learnrecursivemethods.methods;

public class Fibonaccisequence {

    // Example: fibonacci(5) = 5 (0, 1, 1, 2, 3, 5)
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
