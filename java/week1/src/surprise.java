//https://www.acmicpc.net/problem/10926

import java.util.Scanner;

public class surprise {
    public static void main(String[] args){
        String surp = new String("??!");
        String id;

        Scanner sc =  new Scanner(System.in);
        id = sc.nextLine();

        sc.close();

        System.out.println(id+surp);

    }
}
