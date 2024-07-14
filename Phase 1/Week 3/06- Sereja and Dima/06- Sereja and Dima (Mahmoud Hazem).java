//Author: Mahmoud Hazem

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int serajCount = 0;
        int dimaCount = 0;
        int first = 0;
        int last = size - 1;
        boolean whoPlay = true;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        for(int i = 0 ; i < size ; i++)
            if (arr[last] >= arr[first]) {

                if (whoPlay) {
                    serajCount += arr[last];
                    last--;
                    whoPlay = false;

                } else {
                    dimaCount += arr[last];
                    last--;
                    whoPlay = true;
                }
        }
            else if (arr[first] >= arr[last]) {

                    if (whoPlay) {
                        serajCount += arr[first];
                        first++;
                        whoPlay = false;
                    } else {
                        dimaCount += arr[first];
                        first++;
                        whoPlay = true;
                    }
            }
            System.out.println(serajCount + " " + dimaCount);
    }
}