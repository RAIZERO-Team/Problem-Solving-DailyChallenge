// Author: Reem Ezzat


import java.util.Scanner;
 
public class Problem_Solving {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       double num=input.nextInt();
        System.out.println(""+IsWonderfull(num));
          
        
    
}
 public static String Convert(double num){
    String remainder="";
    double start=num/2;
for(double i=start;i>0;i=(i)/2){
if(i%(int)i==0){
remainder=remainder+"0";
}
else{
remainder=remainder+"1";

}
i=(int) i;
}

return remainder;
}
 
 static String IsWonderfull (double num){
 String isWonderful;
 StringBuilder reverseBinary=new StringBuilder(Convert(num)).reverse();
 String reverse=reverseBinary.toString();
 String binary=Convert(num);
     
if((reverse.equals(binary))&&((int)num%2!=0)){

isWonderful="YES";
}
else{
isWonderful="NO";

}
 
return isWonderful;
 }

};