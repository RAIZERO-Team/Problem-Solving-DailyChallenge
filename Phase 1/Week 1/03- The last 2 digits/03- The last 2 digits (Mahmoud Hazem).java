// Author: Mahmoud Hazem




package com.mycompany.last2digits;

import java.util.Scanner;


public class Last2digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long no1,no2,no3,no4;
        
        no1 = input.nextLong();
        no2 = input.nextLong();
        no3 = input.nextLong();
        no4 = input.nextLong();
        
        long lastMulti = ((no1%100)*(no2%100)*(no3%100)*(no4%100))%100;
        
        if(lastMulti < 10) {
        System.out.println("0" + lastMulti);
        }else {
        System.out.println(lastMulti);  
        }     
    }
}
