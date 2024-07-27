//Author: Mahmoud Hazem

package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;

public class Main {
    public static boolean binarySearch(int[] arr, int res) {
        int right = 0;
        int left = arr.length - 1;

        while (right <= left) {
            int mid = (right + left) / 2;

            if (arr[mid] == res) {

                return true;

            } else if (arr[mid] < res) {

                right = mid + 1;

            } else if (arr[mid] > res) {

                left = mid - 1;
            }
        }
        return false;
    }

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int q = input.nextInt();
        int[] n = new int[x];

         for (int i = 0; i < x; i++) {
                n[i] = input.nextInt();
            }

        Arrays.sort(n);
        for (int i = 0; i < q; i++) {

            int num = input.nextInt();

            if (binarySearch(n , num)){

                System.out.println("found");

            } else{

                    System.out.println("not found");

            }
        }

    }
}