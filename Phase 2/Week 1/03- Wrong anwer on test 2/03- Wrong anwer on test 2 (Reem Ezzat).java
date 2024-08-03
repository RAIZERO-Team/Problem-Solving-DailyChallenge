// Author: Reem Ezzat

import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
 
            long number=input.nextLong();
      
            long biggest=0;
            long smallest=0;
           if(number%6==0){
           biggest=number;
           }
           else{
           biggest=(number/6)*6;
           }
                
            
            
          System.out.println("The biggest is "+biggest+"\nThe smallest is "+smallest);
 
    }
}
