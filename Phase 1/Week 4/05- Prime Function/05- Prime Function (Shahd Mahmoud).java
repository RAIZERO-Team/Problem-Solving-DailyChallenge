//Autor: Shahd Mahmoud
package prime.function;

import java.util.Scanner;

public class PrimeFunction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            if (Prime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean Prime(int n) {
        if (n == 2) {
            return true;
        } else if (n <= 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
