//https://www.acmicpc.net/problem/2798

import java.io.*;
import java.util.*;

public class BlackJack {
    static int N, M, max_val;
    static boolean[] visited;
    static String[] cards;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        
        cards = br.readLine().split(" ");
        visited = new boolean[N];
        
        blackjack(0,0);
        bw.write(String.valueOf(max_val));

        br.close();
        bw.close();
    }

    private static void blackjack(int i,int s){
        if (s>M){
            return;
        }

        if (i==3){
            if (s>max_val){
                max_val = s;
            }
            return;
        }
        else{
            for (int j=0;j<N;j++){
                if (visited[j]) continue;
                visited[j] = true;
                blackjack(i+1,s+Integer.parseInt(cards[j]));
                visited[j] = false;
            }
        }
        
    }
}
