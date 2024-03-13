//https://www.acmicpc.net/problem/11653

import java.io.*;
public class Factorization {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = N;
        if (N ==1 ){
        }
        else{
            int cnt = 0;

            for(int i=2; i<= M/2 ; i++ ){
                while (N%i==0){
                    N = N/i;
                    bw.write(String.valueOf(i));
                    bw.newLine();
                    cnt+=1;
                }
            }
            if (cnt==0){
                bw.write(String.valueOf(N));
            }
        }

        br.close();
        bw.close();

    }
}
