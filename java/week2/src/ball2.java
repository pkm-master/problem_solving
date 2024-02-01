//https://www.acmicpc.net/problem/10813

import java.io.*;
import java.util.*;

public class ball2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk1.nextToken());
        int M = Integer.parseInt(stk1.nextToken());

        int[] Balls = new int[N];

        for (int num = 1 ; num <= N ; num ++){
            Balls[num-1] = num;
        }

        for (int i = 0 ; i < M ; i ++){
            StringTokenizer way = new StringTokenizer(br.readLine());
            int first_beg = Integer.parseInt(way.nextToken())-1;
            int second_beg = Integer.parseInt(way.nextToken())-1;

            int save_beg = Balls[second_beg];
            Balls[second_beg] = Balls[first_beg];
            Balls[first_beg] = save_beg;
        }

        for (int num=0 ; num<N ; num++){
            bw.write(String.valueOf(Balls[num]) + " ");
        }

        bw.close();
        br.close();

    }
}
