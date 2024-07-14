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

        int a = input.nextInt();

        for (int i = 0 ; i < n ; i++){
            if(arr[i] == a){
                System.out.println(i);
                break;
            }
            else if (i == n - 1 && arr[i] != a)
                System.out.println("-1");

            
        }

    }
}
