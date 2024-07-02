//Author: basmala mohamed

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int N = X.nextInt();
        int fib1 = 0;
        int fib2 = 1;

        if (N == 1) {
            System.out.print(fib1);
        }else if (N == 2) {
            System.out.print(fib1 + " " + fib2);
        }else if (N > 2) {
            System.out.print(fib1 + " " + fib2); 
            for (int i = 3; i <= N; i++) {
                int fib_n = fib1 + fib2;
                System.out.print(" " + fib_n);
                fib1 = fib2;
                fib2 = fib_n;
            }
        }
    }
}