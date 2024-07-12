//Author: basmala mohamed

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] n = new int[N];
        
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        
        Arrays.sort(n);
        
        for (int i = 0; i < Q; i++) {
            int X = sc.nextInt();
            if (binarySearch(n , X)) {
                System.out.println("found");
            }else {
                System.out.println("not found");
            }
        }
    }

    public static boolean binarySearch(int[] arr, int result) {
        int right = 0;
        int left = arr.length - 1;

        while (right <= left) {
            int mid = (right + left) / 2; 

            if (arr[mid] == result) {
                return true;
            }else if (arr[mid] < result) {
                right = mid + 1;
            }else if (arr[mid] > result) {
                left = mid - 1;
            }
        }
        return false;
    }
}