//Author: Mahmoud Hazem

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        String[] arr = new String[x+1];


        for (int i = 0 ; i <= x ; i++){
            String word = input.nextLine();
            arr[i] = word;
            int len = arr[i].length();
            if(arr[i].length() > 10){
                arr[i]= arr[i].charAt(0)+String.valueOf((arr[i].length() - 2 ))+arr[i].charAt(len-1);
            }
        }
        for (int i = 0 ; i <= x ; i++){
            System.out.println(arr[i]);
        }

    }
}
