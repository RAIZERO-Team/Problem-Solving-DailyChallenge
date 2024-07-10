// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String code=input.next();
        String check="Yes";
        char arr[]=code.toCharArray();
       
    if(arr[num1]=='-'){

        for(int i=0; i<arr.length;i++){
            if(i==num1){
            continue;
            }
        if(arr[i]>=48&&arr[i]<=57){
        check="Yes";

        }
          else{
          check="No";

          break;
          }
        }  
    }
                else{
               check="No";   

                }
                System.out.println(""+check);
    
}}