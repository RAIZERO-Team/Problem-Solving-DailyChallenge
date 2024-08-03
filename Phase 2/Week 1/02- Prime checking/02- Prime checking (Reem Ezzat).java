// Author: Reem Ezzat
 
 
import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
            long number=input.nextLong();
             String result="YES";
            if(number<10&&(number!=2&&number!=3&&number!=5&&number!=7)){
            result="NO";
            }
            else if(number>=10){
            for(int j=2;j<=(int)Math.sqrt(number);j++){
            if(number%j==0){
            result="NO";
            break;
            }
            
            }}
            System.out.println(""+result);
    }
}
