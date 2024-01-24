//https://www.acmicpc.net/problem/11022

import java.util.Scanner;

public class Printformatting {
    public static void main(String[] args){
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for(int case_value = 1;case_value<=test_case;case_value++){
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d %n",case_value,a,b,a+b);

        } 
        sc.close();
    }
}
