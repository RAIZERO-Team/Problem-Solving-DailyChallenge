//Author: Shahd Mahmoud
package even.or.odd;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int evencount = 0;
        int oddcount = 0;
        int positivecount=0;
        int negativecount=0;

       
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x % 2 == 0) {
                evencount++;
            } else if(x%2!=0) {
                oddcount++;
           }
             if(x>0){
                positivecount++;
            }else if(x<0) {
                negativecount++;
            }
        }

        System.out.println("Even: " + evencount);
        System.out.println("Odd: " + oddcount);
        System.out.println("Positive: "+positivecount);
        System.out.println("Negative: "+negativecount);
    }
}