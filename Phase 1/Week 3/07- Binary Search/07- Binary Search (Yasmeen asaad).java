// Author: Yasmeen asaad 


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class BinarySearch {

   
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       int N=sc.nextInt();
       int Q=sc.nextInt();
       int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
 
        Arrays.sort(A);
        for (int i = 0; i < Q; i++) {
            int X = sc.nextInt();
            if (Arrays.binarySearch(A, X) >= 0) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }

    }
    
}
