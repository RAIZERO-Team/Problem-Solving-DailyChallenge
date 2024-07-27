//Author:omnia zedan
import java.util.Scanner;

/**
 *
 * @author 3M.T
 */
public class PrimeFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            PrimeFunction(num);
        }
    }

    public static void PrimeFunction(int num) {
        if (num < 2) {
            System.out.println("NO");
        } else if (num == 2) {
            System.out.println("YES");
        } else if (num % 2 == 0) {
            System.out.println("NO");
        } else {
            boolean isPrime = true;
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }}
            
            System.out.println(isPrime ? "YES" : "NO");
        }
    }
}