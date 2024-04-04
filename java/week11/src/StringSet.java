//https://www.acmicpc.net/problem/14425
import java.io.*;
import java.util.*;

public class StringSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
    
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
    
        Set<String> S = new HashSet<String>();
    
        for (int i=0;i<N;i++){
            S.add(br.readLine());
        }

        int cnt = 0;

        for (int i=0;i<M;i++){
            if(S.contains(br.readLine())){
                cnt+=1;
            }
        }

        bw.write(String.valueOf(cnt));

        br.close();
        bw.close();
    }

}
