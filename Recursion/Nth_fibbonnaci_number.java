package Recursion;

public class Nth_fibbonnaci_number {
    
    public static long fib(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be ≥ 0");
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
         System.out.println("Fib(10) = " + fib(10));
    }
}
