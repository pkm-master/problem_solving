//https://www.acmicpc.net/problem/1008

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        double a;
        double b;
        double div;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b= sc.nextDouble();

        sc.close();

        div = a/b;

        System.out.println(div);
    }
}
