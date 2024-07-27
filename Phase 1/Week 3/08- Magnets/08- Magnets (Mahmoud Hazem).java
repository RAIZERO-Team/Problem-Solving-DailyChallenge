//Author: Mahmoud Hazem

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;
public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        String prev = input.nextLine();
        int count = 1;

        for (int i = 1; i < n; i++) {
            String curr = input.nextLine();

            if (curr.charAt(0) == prev.charAt(1)) {
                count++;
            }
            prev = curr;
        }
            System.out.println(count);

    }
}