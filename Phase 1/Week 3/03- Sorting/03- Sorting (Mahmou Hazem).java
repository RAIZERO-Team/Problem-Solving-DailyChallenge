//Author: Mahmoud Hazem

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt(),
            arr [] = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int z = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = z;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
