//Author:omnia zedan
import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String s=in.next();
        int remove=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                remove++;
            }
        }
        System.out.println(remove);
    }
    
}
