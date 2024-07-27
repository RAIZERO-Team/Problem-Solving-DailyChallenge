//Author:omnia zedan
import java.util.Scanner;
/**
 *
 * @author 3M.T
 */
public class ReverseWords {

    public static void main(String[] args) {
        // TODO code application logic here
     
           Scanner in = new Scanner(System.in);
        String w = in.nextLine();
        String[] words = w.split(" "); 

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse().toString());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}