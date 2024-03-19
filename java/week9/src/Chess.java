// https://www.acmicpc.net/problem/1018
import java.io.*;
import java.util.*;

public class Chess {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        String[] cl = new String[N];
        String pcl;        
        char[] ch = {'W','B'};
        int min_cnt = 50*50;
        int cnt = 0;

        for(int i=0;i<N;i++){
            cl[i] = br.readLine();
        }
        
        for (int i=0;i<N-8+1;i++){
            for (int j=0;j<M-8+1;j++){
                cnt = 0;
                for (int u=0;u<8;u++){
                    pcl = cl[i+u].substring(j,j+8);
                    for (int v=0;v<8;v++){
                        if (pcl.charAt(v) != ch[(u+v)%2]){
                            cnt +=1;
                        } 
                    }
                }
                if(64-cnt<cnt){
                    cnt = 64-cnt;
                }
                if (cnt<min_cnt){
                    min_cnt = cnt;
                }
            }
        }

        bw.write(String.valueOf(min_cnt));

        bw.close();
        br.close();

    }
}
