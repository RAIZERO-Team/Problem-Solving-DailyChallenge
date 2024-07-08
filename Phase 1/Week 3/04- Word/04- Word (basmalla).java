//Author: basmala mohamed

import java.util.Scanner;


public class Word {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);

        String w = X.nextLine();
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            }
        }

        if (upperCase > lowerCase) {
            System.out.println(w.toUpperCase());
        } else if (upperCase < lowerCase){
            System.out.println(w.toLowerCase());
        } else if (upperCase == lowerCase) {
            System.out.println(w.toLowerCase());
        }  
    }
}