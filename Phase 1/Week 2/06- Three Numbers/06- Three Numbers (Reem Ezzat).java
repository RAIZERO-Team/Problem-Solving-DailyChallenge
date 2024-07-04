// Author: Reem Ezzat


import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int s=input.nextInt();
        int counter=0;
        for(int x=0; x<= k;x++){
        
       for (int y = 0; y <= k; y++) {
                
           int z = s-(x+y);
           if(z>=0&&z<=k){
               if(x+y+z==s)
               counter++;
           
           
            }}
            
        }
        System.out.println(""+counter);       

    } }
        