//Author: basmala mohamed

import java.util.Scanner;


public class CreateNewString {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        String S = X.nextLine();
        String T = X.nextLine();
        
        int lengthofS = S.length();
        int lengthofT = T.length();
        
        System.out.println(lengthofS + " " + lengthofT);       
        System.out.println(S + " " + T);
    }
}