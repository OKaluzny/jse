import java.util.Scanner;
import java.util.stream.LongStream;

public class Factorial {

    /*private static int factorial(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 2;
        } else {
            return fact(n - 1) * n;
        }
    }

    *//*Recursion*//*
    private static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException(n + " is out of range");
        return (1 > n) ? 1 : n * factorial(n - 1);
    }

    *//*Imperative*//*
    private static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException(n + " is out of range");
        long product = 1;
        for (int i = 2; i < n; i++) {
            product *= i;
        }
        return product;
    }*/

    /* Streams*/
    private static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException(n + " is out of range");
        return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int userNumber = sc.nextInt();

        System.out.println("Factorial " + userNumber + " is " + Factorial.factorial(userNumber));
    }
}
