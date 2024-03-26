// https://www.acmicpc.net/problem/2839
import java.io.*;

public class Sugar {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int max_5 = N/5;
        boolean can_carry=false;

        for (int i=max_5;i>=0;i--){
            int res = N-5*i;
            if (res%3==0){
                int ans = res/3 + i ;
                bw.write(String.valueOf(ans));
                can_carry=true;
                break;
            }
            
        }

        if (!can_carry){
            bw.write("-1");
        }

        bw.close();
        br.close();
    }
    
}
