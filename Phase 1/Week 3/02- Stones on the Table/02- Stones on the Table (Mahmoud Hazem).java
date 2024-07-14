//Author: Mahmoud Hazem

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String str = input.next();
        int count = 0;
        for (int i = 0 ; i < n - 1 ; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);

    }
}