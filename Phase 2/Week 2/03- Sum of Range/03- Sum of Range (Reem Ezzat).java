// Author: Reem Ezzat

import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
      long A=input.nextLong();
      long B=input.nextLong();
      long sumOfAll=0;
      long sumOfEven=0;
      long SumOfOdds=0;
      long a;
      long b;
       if(A>B){ b=A; a=B; }      
       else{ a=A; b=B;}    
      long firstEven=a;
      long lastEven=b;
      long FirstOdd=a;
      long lastOdd=b;
      long n;
      
// find sum of all
       n=(b-a)+1;
    sumOfAll=n*(a+b)/2;
    
    //find sum of even
    
    if(a%2!=0){
    firstEven=a+1;}
    if(b%2!=0){
     lastEven=b-1;}
       
     n=(lastEven-firstEven)/2+1;
    sumOfEven=n*(firstEven+lastEven)/2;
    
    
    //find sum of odd
    
    if(a%2==0){
    FirstOdd=a+1;}
    if(b%2==0){
    lastOdd=b-1; }
     n=(lastOdd-FirstOdd)/2+1;
    SumOfOdds=n*(FirstOdd+lastOdd)/2;
    
    // if first num in range = last num in range
    if(A==B){
    if(a%2==0){sumOfEven=a; SumOfOdds=0;} else{ sumOfEven=0; SumOfOdds=a;}
    sumOfAll=a;
    }
        System.out.println(""+sumOfAll+"\n"+sumOfEven+"\n"+SumOfOdds);
    }
}