// Author: Reem Ezzat

import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
 
            long n=input.nextLong();
            long numOfEvenNumbers;
            if(n==1){
            numOfEvenNumbers=0;
            }
            else if (n%2==0){
            numOfEvenNumbers=n/2;
            }
            else{
            numOfEvenNumbers=(n-1)/2;
            }
            System.out.println(""+numOfEvenNumbers);
    }
}