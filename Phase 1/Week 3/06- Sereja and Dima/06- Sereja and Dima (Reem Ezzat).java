// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int Sereja_Sum=0;
        int Dima_Sum=0;
        int first_index=0;
        int last_index=n-1;
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        for (int i =0; i < n; i++) {
            if(last_index<0||first_index>n-1){
            break;
            }
            
            if((i%2==0||i==0)&&arr[last_index]>=arr[first_index]){
            Sereja_Sum=Sereja_Sum+arr[last_index];
            last_index--;
            
            }else if((i%2==0||i==0)&&arr[first_index]>arr[last_index]){
            Sereja_Sum=Sereja_Sum+arr[first_index];
            first_index++;

            }
            else{
             if(arr[last_index]>=arr[first_index]){
            Dima_Sum=Dima_Sum+arr[last_index];
            last_index--;
            }
             else  {
            Dima_Sum=Dima_Sum+arr[first_index];
            first_index++;

            }
            }
          /*System.out.println("first index in "+i+"th loop = "+first_index);
            System.out.println("last index in "+i+"th loop = "+last_index);
            System.out.println("First index now --> "+arr[first_index]);
            System.out.println("Last index now --> "+arr[last_index]);
            System.out.println("\n");*/

        }
            
        System.out.println(Sereja_Sum+" "+Dima_Sum);
    
}}