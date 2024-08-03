// Author: Reem Ezzat

import java.util.Scanner;
public class Problem_Solving {
 
   
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
       int sub=A-B;
        if(sub>=0){
            System.out.println(""+sub);
        
        }
        else{
        sub=0;
            System.out.println(""+sub);
        }
        
    } 
       }