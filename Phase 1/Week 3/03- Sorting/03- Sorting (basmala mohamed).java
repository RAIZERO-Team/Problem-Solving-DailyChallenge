//Author: basmala mohamed

import static java.util.Arrays.sort;
import java.util.Scanner;


public class Sorting {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int n = X.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = X.nextInt();
        }
        
        sort(arr);
        
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }     
    }
}