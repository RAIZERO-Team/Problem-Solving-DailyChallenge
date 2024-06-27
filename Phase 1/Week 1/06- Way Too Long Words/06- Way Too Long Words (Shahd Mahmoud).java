//Author: Shahd Mahmoud
package newsolve;

import java.util.Scanner;

public class NewSolve {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String word = in.next();
            int l = word.length();  // length of word
            char fchar = word.charAt(0);  // first char of word
            char lchar = word.charAt(word.length() - 1); // last char of word
            if (l <= 10) {
                System.out.println(word);
            } else {
                System.out.println(fchar + "" + (l - 2) + "" + lchar);
            }
        }
    }

}
