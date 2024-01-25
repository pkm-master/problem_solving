// https://www.acmicpc.net/problem/10871

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class LessThanX {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstline = new StringTokenizer(br.readLine());
        int total_N = Integer.parseInt(firstline.nextToken());
        int X = Integer.parseInt(firstline.nextToken());

        StringTokenizer TotalList = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=1;i<=total_N;i++){
            int num = Integer.parseInt(TotalList.nextToken());
            String num_ = num + " ";
            if(num<X){
                bw.write(num_);

            }
            
        }
        br.close();
        bw.close();
    
    }
}
