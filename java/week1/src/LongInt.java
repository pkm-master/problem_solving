// https://www.acmicpc.net/problem/25314

import java.util.Scanner;

public class LongInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int longint = sc.nextInt();
        sc.close();

        int num_of_long = (longint-1)/4 + 1;


        for(int i=1;i <= num_of_long; i++){
            System.out.printf("long ");
        }

        System.out.println("int");

    }
}
