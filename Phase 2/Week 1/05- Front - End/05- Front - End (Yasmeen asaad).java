//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class FrontEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " " + arr[n - 1 - i] + " ");
        }
        if (n % 2 != 0) System.out.print(arr[n / 2]);
    }
    
}
