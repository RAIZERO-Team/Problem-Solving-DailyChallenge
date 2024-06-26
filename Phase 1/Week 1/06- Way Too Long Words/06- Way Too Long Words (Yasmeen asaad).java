//Author: Yasmeen Asaad

import java.util.Scanner;
/**
 *
 * @author yasmeen asaad
 */
public class LongWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
       
        for(int i=0; i<n;i++){
           String word = sc.nextLine();  
            if(word.length()>10){
              
                System.out.println(word.charAt(0)+"" + Integer.toString(word.length()-2) +""+ word.charAt(word.length()-1));
            }else{
                System.out.println(word);
            }
        }
       
    }
    
}
