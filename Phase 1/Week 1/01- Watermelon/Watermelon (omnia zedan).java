//Author : omnia zedan

import java.util.Scanner;


public class Watermelon {

    public static void main(String[] args) {
    
        Scanner w=new Scanner(System.in);
        System.out.println("write the weight of the watermelon");
        int weight=w.nextInt();
        if(weight%2==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
}
