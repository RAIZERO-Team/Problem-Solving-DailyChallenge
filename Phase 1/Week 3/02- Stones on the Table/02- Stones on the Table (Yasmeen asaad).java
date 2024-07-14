//Author : Yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class Stones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int N = sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int count=0;
        for(int i=1; i<N;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
