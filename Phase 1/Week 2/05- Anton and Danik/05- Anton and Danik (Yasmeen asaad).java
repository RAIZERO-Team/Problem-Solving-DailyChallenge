//Author: yasmeen asaad


import java.util.Scanner;

/**
 *
 * @author yasmeen asaad
 */
public class AntonAndDanik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
       int N=sc.nextInt();
       String S=sc.next();
       int A=0;
       int D=0;
       for(int i=0;i<N;i++){
          char c= S.charAt(i);
          if(c=='A'){
              A++;
          }else{
              D++;
          }
       }if(A>D){
           System.out.println("Anton");
       }else if(A<D){
           System.out.println("Danik");
       }else{
           System.out.println("Friendship");
       }
    }
    
}
