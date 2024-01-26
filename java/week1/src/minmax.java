//https://www.acmicpc.net/problem/10818

import java.io.*;
import java.util.*;

public class minmax {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total_n = Integer.parseInt(br.readLine());
        StringTokenizer n_list = new StringTokenizer(br.readLine());
        br.close();

        int num = Integer.parseInt(n_list.nextToken());
        int max_val = num;
        int min_val = num;


        for (int i = 0 ; i < total_n-1 ; i++ ){
            int value = Integer.parseInt(n_list.nextToken());
            if (value > max_val){
                max_val = value;
            }
            if (value<min_val){
                min_val = value;
            }

        }
        String max_val_ = max_val+" ";
        String min_val_ = min_val+" ";

        bw.write(min_val_);
        bw.write(max_val_);
        bw.close();

    }
}
