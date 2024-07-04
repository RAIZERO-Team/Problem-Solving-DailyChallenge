//Author: Shahd Mahmoud
package easy.fibonacci;

import java.util.Scanner;

public class EasyFibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first_number = 0;
        int second_number = 1;
        int sum ;
        for (int i = 0; i < n; i++) {    //0 1 2 3 4 5 6
            if (i == 0 || i == 1) {
                System.out.print(i + " ");   //0 1
            }else{
            sum = first_number + second_number;  //1 2 3 5 8

            first_number = second_number;           //1 1 2 3 5

            second_number = sum;                   //1 2 3 5 8
           
            System.out.print(sum+" " );            //1 2 3 5 8
            
            
            }
           
            
            
        }
       
    }

}
