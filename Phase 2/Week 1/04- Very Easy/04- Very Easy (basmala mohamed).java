// Author: basmala mohamed

import java.util.Scanner;
 
public class VeryEasy {
 
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
 
        long N = X.nextLong();
        long M = X.nextLong();
        long sum = N + M;
        
        if(sum >= 0){
            System.out.println(sum);
        }else if(sum < 0){
            System.out.println(-sum);
        }
    }
}