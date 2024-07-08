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

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j+1]<arr[j]){
                int temb=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temb;
                }
                
            }
             }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");    
            }
        
        
    } }
