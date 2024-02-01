//https://www.acmicpc.net/problem/10810

import java.io.*;
import java.util.StringTokenizer;


public class ball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk1.nextToken());
        int M = Integer.parseInt(stk1.nextToken());

        int[] Balls = new int[N];
        
        for (int i = 0 ; i < M ; i ++ ){
            StringTokenizer way = new StringTokenizer(br.readLine());
            int min_idx = Integer.parseInt(way.nextToken()) -1 ;
            int max_idx = Integer.parseInt(way.nextToken()) -1 ;
            int ball_num = Integer.parseInt(way.nextToken());

            for (int j = min_idx ; j <= max_idx ; j ++){
                Balls[j] = ball_num;
            }
        }

        for(int k=0; k<N ; k++){
            bw.write(String.valueOf(Balls[k]) + " ");
        }
        
        br.close();
        bw.close();

    }
}
