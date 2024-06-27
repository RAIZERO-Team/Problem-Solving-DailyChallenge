//Author: basmala mohamed

import java.util.Scanner;


public class Way_too_long_words {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int n = X.nextInt();
        X.nextLine();  
        
        for (int i = 0; i < n; i++) {
            String Word = X.nextLine();
            
            if (Word.length() > 10) {
                int Count = Word.length() - 2;
                Word = Word.charAt(0)+String.valueOf(Count)+Word.charAt(Word.length() - 1);
            }
            
            System.out.println(Word);
        }
    }
}