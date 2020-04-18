package javatraining.oletsky.javafunctions;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int n = 6;
        int r=factor(n);
        System.out.printf("Factorial of %d is %d", n,r);
    }

    static int factor(int n) {
        if (n == 0) return 1;
        else return n * factor(n - 1);
    }
}
