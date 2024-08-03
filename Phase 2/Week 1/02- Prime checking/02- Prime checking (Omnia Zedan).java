//Author : Omnia Zedan
import java.util.Scanner;

public class PrimeChecking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        
        if (num < 2) {
            System.out.println("NO");
        } else if (num == 2) {
            System.out.println("YES");
        } else {
            boolean prime = true;
            for (long i = 2; i*i <= num; i++) {
                if (num% i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }}