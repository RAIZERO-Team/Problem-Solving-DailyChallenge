//Author: omnia zedan

import java.util.Scanner;


public class AntonAndDanik {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner (System.in);
        int n=in.nextInt();
        String s = in.next();
        
        int numOfA=0;
        int numOfD=0;
        char[] characters = s.toCharArray();
        char compareChar='A';
        
        
        for(int j=0;j<n;j++){
            char current=characters[j];
            if(current == compareChar )
                numOfA++;
            else
                numOfD++;
            
        }
      
        if(numOfA>numOfD)
            System.out.println("Anton");
        else if(numOfA==numOfD)
            System.out.println("Friendship");
        else 
            System.out.println("Danik");
    }
    
}
