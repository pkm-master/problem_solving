//https://www.acmicpc.net/problem/1000

import java.util.Scanner;

public class Plus {
    public static void main(String[] args){
        int a;
        int b;
        int sum;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();

        sc.close();

        sum = a+b;

        System.out.println(sum);
    }
}
