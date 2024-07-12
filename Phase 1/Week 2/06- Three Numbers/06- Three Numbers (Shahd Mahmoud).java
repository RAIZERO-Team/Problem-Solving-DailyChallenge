//Author: Shahd Mahmoud
package three.numbers;

import java.util.Scanner;
public class ThreeNumbers {
    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int k=in.nextInt();
     int s=in.nextInt();
     int counter =0;
        for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                if(s-i-j>=0&&s-i-j<=k){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    
}
