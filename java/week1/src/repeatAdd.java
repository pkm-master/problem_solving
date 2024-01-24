//https://www.acmicpc.net/problem/10951

import java.util.Scanner;

public class repeatAdd {
    public static void main(String[] args){
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            a = sc.nextInt();
            if(a<0){
                break;
            }
            b = sc.nextInt();

            System.out.println(a+b);

        } 
        sc.close();
    }
}
