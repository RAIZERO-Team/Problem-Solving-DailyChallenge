//Author: Shahd Mahmoud
package anton.and.danik;

import java.util.Scanner;

public class AntonAndDanik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int A = 0;  //number A in s
        int D = 0;  //number D in s

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                A++;
            } else {
                D++;
            }
        }
        if (A > D) {
            System.out.println("Anton");
        } else if (A < D) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }

}
