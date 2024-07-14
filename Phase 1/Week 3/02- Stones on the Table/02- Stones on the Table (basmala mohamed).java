//Author: basmala mohamed

import java.util.Scanner;


public class Stones_on_the_table {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        int n = X.nextInt();
        String stones = X.next();
        int removedStones = 0;
        
        for (int i = 1 ; i < n ; i++){
            if (stones.charAt(i) == stones.charAt(i - 1)){
                removedStones++;
            }
        }
        System.out.println(removedStones);
    }
}