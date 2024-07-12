// Author: Reem Ezzat

import java.util.Scanner;

public class Problem_Solving {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr= new int[n];
        
        for (int i = 0; i < n; i++) {
             arr[i]=input.nextInt();
             
        }
                int key=input.nextInt();

        
        for (int i = 0; i < n; i++) {
            if(arr[i]==key){
                 System.out.println(""+i);
             break;
             }
             else if(i==n-1&&arr[i]!=key){
                System.out.println("-1");
             }
        }
    } }
        
