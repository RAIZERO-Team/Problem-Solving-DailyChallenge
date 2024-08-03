//Author:Omnia Zedan
import java.util.Scanner;

public class FrontEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] a = new int[n];
     
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
       int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (start <= end) {
                System.out.print(a[start] + " ");
                start++;
            }
            if (start <= end) {
                System.out.print(a[end] + " ");
                end--;
            }
        }
    }
}
