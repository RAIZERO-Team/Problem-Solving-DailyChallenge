// Author: Reem Ezzat


import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       int numOfTestCases=input.nextInt();
        
        

        for (int i = 0; i < numOfTestCases; i++) {
                        int number=input.nextInt();
                        
            System.out.println(""+Prime(number));
        }
        
    
}
    public static String Prime(int number){
        
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
           
        
    
    return result;
    }
 
};
