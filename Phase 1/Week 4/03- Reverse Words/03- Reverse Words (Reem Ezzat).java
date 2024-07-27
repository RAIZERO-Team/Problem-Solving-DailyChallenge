// Author: Reem Ezzat


import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       String s=input.nextLine();
        String subString[]=s.split("\\s+");
        char Reverse[]=new char [s.length()];
        StringBuilder Sentence=new StringBuilder();
       
        
        for (int i = 0; i < subString.length; i++) {
            
            int n=(subString[i].length())-1;
            for(int j=0;j<=subString[i].length();j++){
                if(n>=0){
            Reverse[j]=subString[i].charAt(n);
                    Sentence=Sentence.append(Reverse[j]);
                      n--;
                }
                if(n<0&&i<(subString.length)-1){
                   Sentence=Sentence.append(' ');
 
                break;
                }
            
            }
           
        }
 
                
        System.out.println(""+Sentence);
       
       
        
        
        
    
}};