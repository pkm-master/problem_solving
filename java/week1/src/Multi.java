//https://www.acmicpc.net/problem/10998

import java.util.Scanner;

public class Multi {
    public static void main(String[] args){
        int a;
        int b;
        int multi;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();

        sc.close();

        multi = a*b;

        System.out.println(multi);
    }
}
