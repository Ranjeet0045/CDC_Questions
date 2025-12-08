package Recursion;

public class Print_1_to_N {
    
    public static void print1toN(int n) {
        if (n <= 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        System.out.print("Print 1 to 5: ");
        print1toN(5);
    }
}
