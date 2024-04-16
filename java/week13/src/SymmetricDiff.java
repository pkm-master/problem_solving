// https://www.acmicpc.net/problem/1269
import java.io.*;
import java.util.*;

public class SymmetricDiff {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        HashSet<Integer> A = new HashSet<Integer>();
        int total = 0;

        StringTokenizer stkA = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            A.add(Integer.parseInt(stkA.nextToken()));
            total += 1;
        }

        StringTokenizer stkB = new StringTokenizer(br.readLine());
        for (int j=0;j<M;j++){
            if (A.contains(Integer.parseInt(stkB.nextToken()))){
                total-=1;
            }
            else{
                total+=1;
            }
        }

        bw.write(String.valueOf(total));

        br.close();
        bw.close();
        
    }
}
