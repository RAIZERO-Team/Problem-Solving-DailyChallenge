//Author: Shahd Mahmoud
package george.and.accommodation;

import java.util.Scanner;

public class GeorgeAndAccommodation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of rooms
        int room = 0; // number of rooms is available
        for (int i = 0; i < n; i++) {
            int pi = in.nextInt();
            int qi = in.nextInt();

            if (qi - pi >= 2) {
                room++;
            }
        }
        System.out.println(room);
    }

}
