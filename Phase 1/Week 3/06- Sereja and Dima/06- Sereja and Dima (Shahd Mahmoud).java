//Author: Shahd Mahmoud
package serjea.and.dema;

import java.util.Scanner;

public class SerjeaAndDema {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum_serjeacards = 0;
        int sum_demacards = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[left] <= arr[right]) {
                if (i % 2 == 0) {
                    sum_serjeacards += arr[right];
                } else {
                    sum_demacards += arr[right];
                }
                right--;
            } else {
                if (i % 2 == 0) {
                    sum_serjeacards += arr[left];
                } else {
                    sum_demacards += arr[left];
                }
                left++;
            }
        }

        System.out.println(sum_serjeacards + " " + sum_demacards);
    }
}
