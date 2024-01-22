//https://www.acmicpc.net/problem/10869

import java.util.Scanner;

public class all_4 {
    public static void main(String[] args){
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();

        sc.close();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
