package Recursion;

public class Factorial_of_number {

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be ≥ 0");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
