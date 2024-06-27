// Author: Reem Ezzat
import java.util.Scanner;

public class Problem_Solving {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int number_of_words=input.nextInt();
        String arr[]= new String[number_of_words];
        
        for(int i=0;i<arr.length;i++){
        
            String word=input.next();
            if(word.length()>10){
            arr[i]=(""+word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));
            
                               }
             else{
                 arr[i]=word;
                 }
        
                                      }
        
            for(int j=0;j<arr.length;j++){
            System.out.println(""+ arr[j]);
            
                                         }
        

    } }