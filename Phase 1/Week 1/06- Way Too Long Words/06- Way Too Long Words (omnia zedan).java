//Author: omnia zedan
import java.util.Scanner;


public class WayTooLongWords {

       public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner (System.in);
        int numOfwords=in.nextInt();
        
       
        
        for(int i=0;i<numOfwords;i++){
              String words=in.next();
       if(words.length()<=10){ 
            System.out.println(words);
        } else{
           int length =words.length()-2;
         
            System.out.println(words.charAt(0)+""+length+""+words.charAt(words.length()-1));
        }
    }    
        }
}
    
