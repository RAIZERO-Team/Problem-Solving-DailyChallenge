//Author: basmala mohamed

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int n = X.nextInt(); 
        X.nextLine(); 
        
        String previousMagnet = X.nextLine(); 
        int groups = 1; 
        
        for (int i = 1; i < n; i++) {
            String currentMagnet = X.nextLine();
            
            if (currentMagnet.charAt(0) == previousMagnet.charAt(1)) {
                groups++;
            }
            previousMagnet = currentMagnet;
        }
        System.out.println(groups);
    }
}