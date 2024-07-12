//Author: Shahd Mahmoud

package newword;

import java.util.Scanner;
public class Newword {

    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       String word=in.next();
       int upperLetters=0;
       int lowerLetters =0;
       for(int i=0;i<word.length();i++){
           if(word.charAt(i)>=65&&word.charAt(i)<=90){
               upperLetters++;
           }else{
               lowerLetters++;
           }
       }
       if(lowerLetters>=upperLetters){
          System.out.println(word.toLowerCase());
       }else{
           System.out.println(word.toUpperCase());
       }
    }
    
}
