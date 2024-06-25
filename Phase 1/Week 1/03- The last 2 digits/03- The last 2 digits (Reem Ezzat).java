// Author: Reem Ezzat

import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n1=input.nextLong();
        long  n2=input.nextLong();
        long n3=input.nextLong();
        long  n4=input.nextLong();
                long []arr={n1,n2,n3,n4};

        for(int i=0;i<4;i++){
        if (arr[i]>1000){
            arr[i]=arr[i]%100;
                        }
                              }
        
        long Multiplication=(arr[0]*arr[1]*arr[2]*arr[3]);
        
        if (Multiplication==0){
            System.out.println("00");
                              }
        
       else if(Multiplication<10){
           System.out.println(""+Multiplication);
                                 }
       
       else{
           
           String Stringm = "" + Multiplication;
           
           
        String lastTwo = Stringm.substring(Stringm.length()-2);
        System.out.println(""+lastTwo);  }
        

    } }