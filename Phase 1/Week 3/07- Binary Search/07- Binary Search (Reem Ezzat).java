// Author: Reem Ezzat

import java.util.Arrays;
import java.util.Scanner;

public class Problem_Solving {

    
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                
                
             int num_of_elements=input.nextInt();
             int num_of_search_tests=input.nextInt();
             int arr[]=new int [num_of_elements];
             int keys[]=new int[num_of_search_tests];
             String results[]=new String[num_of_search_tests];
             for(int i=0;i<num_of_elements;i++){
             
             arr[i]=input.nextInt();
             }
             for(int i=0;i<num_of_search_tests;i++){
             
             keys[i]=input.nextInt();
             
             }
             //sorting the array before searching
                     Arrays.sort(arr); //I found this function to sort my array with less time

             /*
             //printing the array after sorting
             for(int i=0;i<num_of_elements;i++){
                 System.out.print(arr[i]+" ");
             }*/
             
             
          

             for(int i=0;i<num_of_search_tests;i++){
             int first_index=0;
             int last_index=num_of_elements-1;
             results[i]="not found";


              while (first_index <= last_index){
            int mid=(first_index+last_index)/ 2;
            
            if (keys[i]==arr[mid]){
                results[i]="found";
                break;
            }
            if (keys[i]<arr[mid]){
                last_index=mid-1;
            }
            if (keys[i]>arr[mid]){
                first_index=mid+1;
            }
              } 
                   
       } 
                          
             //printing result
             for(int i=0;i<num_of_search_tests;i++){
                 System.out.println(""+results[i]);
             }

       
    
}}
