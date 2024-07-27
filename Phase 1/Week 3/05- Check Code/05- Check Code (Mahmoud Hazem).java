//Author: Mahmoud Hazem

package org.example;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int No1 = input.nextInt(),
            No2 = input.nextInt(),
            count = 0;

        String code = input.next();
        boolean checkLen = false,
                checkDash = false,
                checkDigit = false;

        if(code.charAt(No1) == '-'){
            checkDash = true;
        }
        if(code.length() == No1 + No2 + 1){
            checkLen = true;
        }
        if(code.length() - 1 == No1 + No2){
            checkDigit = true;
        }
        if(checkDigit && checkDash && checkLen){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}