// Author: basmala mohamed

import java.util.Scanner;

public class GeorgeAndAccommodation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rooms = sc.nextInt();
        int availableRooms = 0;
        
        for (int i = 0; i < rooms ;i++) {
            int pi = sc.nextInt();
            int qi = sc.nextInt();
            
            if (qi - pi >= 2) {
                availableRooms++;
            }
        }
        System.out.println(availableRooms);
    }
}