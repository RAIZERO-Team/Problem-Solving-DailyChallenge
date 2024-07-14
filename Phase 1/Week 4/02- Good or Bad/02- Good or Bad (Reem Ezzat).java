// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numOfTestCases=input.nextInt();
         String arr[]=new String[numOfTestCases];

        for (int i = 0; i < numOfTestCases; i++) {
                    String s=input.next();
                    if(s.contains("101")||s.contains("010")){
                    arr[i]="Good";
                    }
                    else{
                    arr[i]="Bad";
                    }

        }
        for (int i = 0; i < numOfTestCases; i++) {
            System.out.println(""+arr[i]);
            
        }
      
        
        
        
        
    
}};