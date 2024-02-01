//https://www.acmicpc.net/problem/1546

import java.io.*;
import java.util.*;

public class average {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score_num = Integer.parseInt(br.readLine());
        StringTokenizer scores = new StringTokenizer(br.readLine());

        int[] score_list = new int[score_num];
        int max_score = Integer.parseInt(scores.nextToken());
        score_list[0] = max_score;

        for (int i=1;i<score_num;i++){
            int score = Integer.parseInt(scores.nextToken());
            if (max_score<score){
                max_score = score;
            }
            score_list[i] = score;
        }

        double score_sum = 0.0;
        for (int j=0; j<score_num; j++){
            int present_score = score_list[j];
            double new_score = ((present_score * 1.0 )/max_score) * 100;
            score_sum += new_score;
        }

        double new_avg = score_sum/score_num;
        bw.write(String.valueOf(new_avg));

        br.close();
        bw.close();

    }
}
