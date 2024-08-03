// Author: Reem Ezzat

import java.util.Scanner;
 
public class Problem_Solving {
 
    
    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
               int n=input.nextInt();
               int arr[]=new int[n];
               int newArr[]=new int[n];
               int first_index=0;
               int last_index=arr.length-1;
               for(int i=0;i<arr.length;i++){
                  arr[i]=input.nextInt();
               }
               for(int i=0;i<arr.length;i++){
                   if(first_index>last_index||last_index<0){
                   break;
                   }
               if(i%2==0){
                   newArr[i]=arr[first_index];
                   first_index++;
               
               }
               else if(i%2!=0){
               newArr[i]=arr[last_index];
               last_index--;
               }
               
               }
               for(int i=0;i<newArr.length;i++){
                   if(i==newArr.length-1){
                   System.out.print(newArr[i]);
 
                   }
                   else{
                   System.out.print(newArr[i]+" ");
 
                   }
               }
    }
}
