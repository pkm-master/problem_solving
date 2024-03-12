//https://www.acmicpc.net/problem/2563
import java.io.*;

public class paper {
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[100][100];

        for (int i=0;i<n;i++){
            String[] nls = br.readLine().split(" ");
            int N = Integer.parseInt(nls[0]);
            int M = Integer.parseInt(nls[1]);

            for (int u=N;u<N+10;u++){
                for (int v=M;v<M+10;v++){
                    arr[u][v] = 1;
                }
            }
        }
        
        int tot_sum = 0;
        for (int p=0;p<100;p++){
            for(int q=0;q<100;q++){
                tot_sum += arr[p][q];
            }
        }

        bw.write(String.valueOf(tot_sum));        
        br.close();
        bw.close();
    }
}

