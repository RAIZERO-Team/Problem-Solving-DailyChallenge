// Author: basmala mohamed

import java.util.Scanner;

public class PrimeChecking {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        long n = X.nextLong();
        
        if (Prime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static boolean Prime(long n) {
        if (n == 2) {
            return true;
        }
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        for (long i = 3; i*i <= n ; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}