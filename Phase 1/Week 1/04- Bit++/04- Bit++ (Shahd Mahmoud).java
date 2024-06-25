//Author: Shahd Mahmoud
package bit;

import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=0;
       // String s=in.next();
        for( int i=0;i<n;i++){
            String s=in.next();
            if("X++".equals(s)||"++X".equals(s)){
                x++;
            }else{
                --x;
            }
        }
        System.out.println(x);
    }
    
}
