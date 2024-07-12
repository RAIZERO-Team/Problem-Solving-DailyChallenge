//Author: Shahd Mahmoud
package stones;

import java.util.Scanner;

public class Stones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int []arr=new int[n];

        String str = in.next();
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
