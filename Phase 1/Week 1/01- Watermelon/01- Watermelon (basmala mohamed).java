//Author: basmala mohamed 

import java.util.Scanner;


public class WaterMelon {

    public static void main(String[] args) {
        
        Scanner X = new Scanner(System.in);
        int weight = X.nextInt();
        
        if(weight%2==0 && weight!=2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}