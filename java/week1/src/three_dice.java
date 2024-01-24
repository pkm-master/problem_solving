//https://www.acmicpc.net/problem/2480

import java.util.Scanner;

public class three_dice {
    public static void main(String[] args){
        int dice1;
        int dice2;
        int dice3;
    
        Scanner sc =  new Scanner(System.in);

        dice1 = sc.nextInt();
        dice2 = sc.nextInt();
        dice3 = sc.nextInt();

        int[] dices = {dice1, dice2, dice3};

        int prize = 0;

        if (dice1 == dice2 && dice2 == dice3){
            prize = 10000 + dice1 * 1000;
        } else if (dice1 == dice2 || dice1 == dice3){
            prize = 1000 + dice1 * 100;
        } else if (dice2==dice3){
            prize = 1000 + dice2 * 100;
        } else{
            for (int dice : dices){
                prize = Math.max(dice,prize);
            }
            prize = prize * 100;
        }

        sc.close();

        System.out.println(prize);


    }
}
