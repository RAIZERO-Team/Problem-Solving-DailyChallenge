//Author: Mahmoud Hazem


package com.mycompany.sortnumbers;

import static java.util.Arrays.sort;
import java.util.Scanner;


public class sortNumbers {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int arr[]={x,y,z};
        
        sort(arr);
        
        for(int i=0; i<3;i++){
            System.out.println(arr[i]);
        }

        System.out.println();
        
        System.out.println(arr[x]);
        System.out.println(arr[y]);
        System.out.println(arr[z]);
        
        
        
    }
}
