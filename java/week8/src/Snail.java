//https://www.acmicpc.net/problem/2869
import java.io.*;
import java.util.StringTokenizer;

public class Snail{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        double[] var = new double[3];
        for(int i=0;i<3;i++){
            var[i] = Integer.parseInt(stk.nextToken());
        }
        // [V - a ] // (a-b)

        int ans = (int) Math.ceil((var[2] - var[0])/(var[0]-var[1])) + 1 ;

        bw.write(String.valueOf(ans));

        br.close();
        bw.close();
    }
}