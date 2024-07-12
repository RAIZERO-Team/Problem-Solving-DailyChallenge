//Author :omnia zedan
import java.util.Scanner;


public class word {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
      

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

      
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }

     
        String correctedWord = (upperCaseCount > lowerCaseCount) ? word.toUpperCase() : word.toLowerCase();

     
        System.out.println(correctedWord);
    }
}
   

        
    