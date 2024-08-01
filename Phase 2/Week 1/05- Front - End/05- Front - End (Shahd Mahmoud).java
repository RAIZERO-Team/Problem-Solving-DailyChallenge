//Author: Shahd Mahmoud
package front.end;

import java.util.Scanner;

public class FrontEnd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int front = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr2[i] = arr1[front++];
            } else {
                arr2[i] = arr1[end--];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
