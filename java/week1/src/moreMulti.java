//https://www.acmicpc.net/problem/2588

import java.util.Scanner;

public class moreMulti {
    public static void main(String[] args){
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*(b/10-((b/100)*10)));
        System.out.println(a*(b/100));
        System.out.println(a*b);

        sc.close();
    }
}
