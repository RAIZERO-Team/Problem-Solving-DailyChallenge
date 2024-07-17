// Author; basmala mohamed

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        int T = X.nextInt();

        for (int i = 0 ; i < T ; i++) {
            int N = X.nextInt();
            
            if (Prime(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean Prime(int n) {
        if (n == 2) {
            return true;
        }else if (n <= 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3 ; i*i <= n ; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}