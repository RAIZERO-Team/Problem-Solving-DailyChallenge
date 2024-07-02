// Author: Reem Ezzat

import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int previous_fib=0;
        int before_previous_fib=0;
        int fib=0;
      
        for(int i=1;i<=num;i++){
        if(i==1){
            fib=0;} 
        
       else if (i==2){
          fib=1;  }
       
   else{
           before_previous_fib=previous_fib;
           previous_fib=fib;
           /* System.out.println("previous: "+prev_fib);
            System.out.println("Before previous: "+before_prev_fib);*/

            fib=previous_fib+before_previous_fib;
         
             }
            System.out.print(fib+" ");

        
 }
       
        

    } }