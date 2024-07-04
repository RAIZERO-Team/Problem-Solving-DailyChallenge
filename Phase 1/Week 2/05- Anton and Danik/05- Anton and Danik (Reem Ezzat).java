// Author: Reem Ezzat

import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int numOFGames=input.nextInt();
        
        String Winner=input.next();
        int Anton=0;
        int Danik=0;
        
  for(int i=0;i<numOFGames;i++){
        if(Winner.charAt(i)=='A'){
            Anton++;
        
             }
        
        else if(Winner.charAt(i)=='D'){
            
            Danik++;
             }
    }
        if(Anton>Danik){
            System.out.println("Anton");
        }
        else if(Danik>Anton){
           System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

    } }