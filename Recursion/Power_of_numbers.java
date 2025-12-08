package Recursion;

public class Power_of_numbers {
    
    public static long power(long x, int n) {
        if (n < 0) throw new IllegalArgumentException("n must be ≥ 0");
        if (n == 0) return 1;
        long half = power(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return x * half * half;
    }

    public static void main(String[] args) {
        System.out.println("2^10 = " + power(2, 10));
    }
}
