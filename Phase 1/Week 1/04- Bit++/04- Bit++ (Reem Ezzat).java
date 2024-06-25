// Author: Reem Ezzat
import java.util.Scanner;

public class Problem_Solving {


    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numberOfStatements=input.nextInt();
        int x=0;
        for(int i=0;i<numberOfStatements;i++){
        String  s=input.next();
        if(s.contentEquals("X++")||s.contentEquals("++X")){
        x++;
        }
          else if(s.contentEquals("X--")||s.contentEquals("--X")){
           --x;
             }
                                             }
               System.out.println(""+x);

       
        
       

    } }

