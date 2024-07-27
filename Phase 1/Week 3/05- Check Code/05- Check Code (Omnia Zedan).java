//Author:omnia zedan
import java.util.Scanner;

public class CheckCode{

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
       
      int A=in.nextInt();
      int B=in.nextInt();
      String s=in.next();
      boolean IsValid=true;
      if(s.length()!=A+B+1){
          IsValid=false;
          
      }
      if( s.charAt(A)!='-'){
       IsValid=false;   
          
          }
    for(int i=0;i<s.length();i++){
        if(i!=A&& !Character.isDigit(s.charAt(i))){
            IsValid=false;
            break;
        }
    }
    if(IsValid){
        System.out.println("Yes");
    } else{
        System.out.println("No");
    
    }
    
   
   
        
    }
}