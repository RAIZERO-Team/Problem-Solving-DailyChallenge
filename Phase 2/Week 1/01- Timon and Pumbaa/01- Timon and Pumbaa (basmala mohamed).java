// Author: basmala mohamed

import java.util.Scanner;

public class Timon_and_Pumba {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int a = X.nextInt();
        int b = X.nextInt();
        int difference = a - b;
        
        if(a > b || a == b){
            System.out.println(difference);
        }else if(a < b){
            System.out.println("0");
        }
    }
}