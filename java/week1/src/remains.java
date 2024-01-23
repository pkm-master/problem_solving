//https://www.acmicpc.net/problem/10430

import java.util.Scanner;

public class remains {
    
    public static void main(String[] args){
        int a;
        int b;
        int c;
        
        Scanner sc = new Scanner(System.in);

        a= sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sc.close();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
        
    }

    
}
