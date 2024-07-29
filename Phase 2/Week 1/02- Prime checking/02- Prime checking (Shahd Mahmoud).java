//Author: Shahd Mahmoud
package prime.checking;

import java.util.Scanner;

public class PrimeChecking {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        boolean prime_number = true;
        if (n == 0 || n == 1) {
            prime_number = false;
        }
        for (long i = 2; i * i <= n; i++) {//2
            if (n % i == 0) {
                prime_number = false;
                break;
            }
        }
        if (prime_number) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
