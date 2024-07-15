//Author: Shahd Mahmoud
package good.or.bad;

import java.util.Scanner;

public class GoodOrBad {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            if (s.contains("010") || s.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
    
}
