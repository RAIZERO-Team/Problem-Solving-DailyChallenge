//Author: Mahmoud Hazem

package org.example;
import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        int [] secArr = new int[n];
        int first = 0;
        int last = n - 1;

        for (int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                secArr[i] = arr[first++];
            }else {
                secArr[i] = arr[last--];
            }
        }
        for (int i = 0 ; i < n ; i++){
            System.out.print(secArr[i] + " ");
        }
    }
}