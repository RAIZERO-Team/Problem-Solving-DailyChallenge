// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {

    public static void main(String[] args) {
        // ASCII code -> lowercase 97 -> 122
        //                uppercase 65 -> 90
        Scanner input = new Scanner(System.in);
        String s = input.next();

        int counter_of_lowercase = 0;
        int counter_of_uppercase = 0;

        // Now I need to know how many lowercase vs uppercase letters
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                counter_of_lowercase++;
            } else {
                counter_of_uppercase++;
            }
        }
        
       //the conversion method
        if (counter_of_lowercase >= counter_of_uppercase) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                    int c = (int) s.charAt(i) + 32;
                    char letter = (char) c;
                    s = s.replace(s.charAt(i), letter);
                }
            }
        } 
         else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    int c = (int) (s.charAt(i) - 32);
                    char letter = (char) c;
                    s = s.replace(s.charAt(i), letter);
                }
            }
         }

        System.out.println(s);
    }
}