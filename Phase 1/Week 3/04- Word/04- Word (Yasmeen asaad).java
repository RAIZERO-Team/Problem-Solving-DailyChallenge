//Author: Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class Word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s=sc.nextLine();
        int countUppercase =0;
        int countLowercase =0;
        for(int i=0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                countUppercase++;
            }else{
                countLowercase++;
            }
        }
        if(countUppercase>countLowercase){
            System.out.println(s.toUpperCase());
        }else{
            System.out.println(s.toLowerCase());
        }
    }
    
}
