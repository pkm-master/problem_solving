//https://www.acmicpc.net/problem/1001

import java.util.Scanner;

public class Minus {
    public static void main(String[] args){
        int a;
        int b;
        int minus;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();

        sc.close();

        minus = a-b;

        System.out.println(minus);
    }
}
