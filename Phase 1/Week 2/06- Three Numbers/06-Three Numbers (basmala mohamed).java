//Author: basmala mohamed

import java.util.Scanner;


public class ThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X , Y , Z;
        int K = sc.nextInt();
        int S = sc.nextInt();
        int count = 0;
        
        for (X = 0; X <= K; X++) {
            for (Y = 0; Y <= K; Y++) {
                Z = S - X - Y;
                S = X + Y + Z;
                if (Z >= 0 && Z <= K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}