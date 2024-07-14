// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        String arr[]=new String [n];
        int counter=0;
        for (int i = 0; i < n; i++) {
            arr[i]=input.next();
            if(i==0){
            counter++;
            }
            else{
            //if this string starts with the same char that the previous string ends with
            if(arr[i].charAt(0)==arr[i-1].charAt(1)){
            counter++;
            
            }}
            
        }
        System.out.println(""+counter);
        
    
}}