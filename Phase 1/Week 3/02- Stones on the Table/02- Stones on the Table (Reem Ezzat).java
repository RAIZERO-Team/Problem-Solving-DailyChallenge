// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s= input.next();
        int counter=0;
        
        for(int i=0; i<n-1;i++){
         
          if(s.charAt(i)==s.charAt(i+1)){
          counter++;
          }  
            
        }
        System.out.println(""+counter);
        
        
    } }