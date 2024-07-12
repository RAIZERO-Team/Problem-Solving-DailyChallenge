//Author: basmala mohamed

import java.util.Scanner;

public class SerjaAndDima {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);

        int size = X.nextInt();
        int[] cards = new int[size];

        for (int i = 0; i < size; i++) {
            cards[i] = X.nextInt();
        }

        int sereja = 0, dima = 0;
        boolean serejaPlaying = true;
        int left = 0, right = size - 1;

        while (left <= right){
            int chooseCard;
            if(cards[right] > cards[left]){
                chooseCard = cards[right];
                right--;
            }else{
                chooseCard = cards[left];
                left++;
            }

            if(serejaPlaying){
                sereja += chooseCard;
            }else{
                dima += chooseCard;
            }
            serejaPlaying = !serejaPlaying;
        }
        System.out.println(sereja + " " + dima);
    }
}