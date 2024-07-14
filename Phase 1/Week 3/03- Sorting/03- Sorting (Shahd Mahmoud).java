//Author: Shahd Mahmoud
package sorting;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int index = i;
            int value = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < value) {
                    index = j;
                    value = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = value;
            arr[index] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
