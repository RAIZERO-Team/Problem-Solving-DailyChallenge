//Author: Yasmeen asaad


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       String S =sc.nextLine();
         String[] words = S.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
 
        
        String result = String.join(" ", words);
        
        System.out.println(result);
       
    }
    
}
