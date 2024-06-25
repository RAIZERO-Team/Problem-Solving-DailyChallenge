// Author: Mahmoud Hazem


package com.mycompany.last2digits;

import java.util.Scanner;


public class Last2digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no1,no2,no3,no4;
        
        no1 = input.nextInt();
        no2 = input.nextInt();
        no3 = input.nextInt();
        no4 = input.nextInt();
        
        int lastMulti = (no1*no2*no3*no4)%100;
        System.out.println(lastMulti);
        
        
        
        
    }
}
