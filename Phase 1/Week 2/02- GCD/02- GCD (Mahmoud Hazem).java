//Author: Mahmoud Hazem

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt() , y = input.nextInt();
        int greater;
        int gcdX = 1 , gcdY = 1 , gcd = 1;
        if ( x > y){
            greater = x;
        } else if (y > x) {
            greater = y;
        } else{
            greater = x;
        }

        for(int i = 1 ; i <= greater ; i++){
            if(x % i == 0){
                gcdX = i;
            }
            if(y % i == 0){
                gcdY = i;
            }
            if(gcdX == gcdY){
                gcd = gcdX;
            }
        }
        System.out.println(gcd);


    }
}
