// Author : Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int first_num=input.nextInt();
        int second_num=input.nextInt();
        int minimum;
        
       if(first_num<second_num){
       minimum=first_num;
       }
       else{
       minimum=second_num;
       }
            
       for(int i=minimum;i>0;i--){
       
       if(first_num%i==0&&second_num%i==0){
           System.out.println(""+i);
           break;
       }
       }                                  
        

    } }