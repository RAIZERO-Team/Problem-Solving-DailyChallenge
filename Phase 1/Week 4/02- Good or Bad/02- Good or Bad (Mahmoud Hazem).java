//Author: Mahmoud Hazem

package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;
public class Main {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int nom = input.nextInt();

        for (int i = 0; i < nom ; i++){
            String S = input.next();
            
            if (S.contains("010")){
                System.out.println("Good");
                
            }else if(S.contains("101")){
                System.out.println("Good");
                
            }else{
                System.out.println("Bad");
                
            }
        }
    }
}