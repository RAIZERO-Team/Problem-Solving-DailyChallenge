//Author: basmala mohamed

import java.util.Scanner;


public class E_O_P_N_numbers {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);

        int n = X.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < n; i++){
            int number = X.nextInt();
            
            if (number % 2 == 0){
                evenCount++;      
            }else if (number % 2 != 0){
                oddCount++;    
            }if (number > 0){
                positiveCount++;  
            }else if (number < 0){   
                negativeCount++;
            }
        }
        
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
    }
}