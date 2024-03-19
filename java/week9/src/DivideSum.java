// https://www.acmicpc.net/problem/2231
import java.io.*;

public class DivideSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int val;
        int ans = 0;
        
        int N = Integer.parseInt(br.readLine());
        for (int i=1;i<N;i++){
            val = i;
            int calc_v = i;
            while(calc_v>0){
                val += calc_v%10;
                calc_v = calc_v/10;
            }

            if (val == N){
                ans = i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
    
        br.close();
        bw.close();
    }

}
