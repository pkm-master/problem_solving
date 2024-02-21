//https://www.acmicpc.net/problem/2444

import java.io.*;

public class star {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=2*N-1;i++ ){
            for (int j=1;j<=Math.abs(N-i);j++){
                bw.write(" ");
            }
            for (int j=Math.abs(i-N)*2;j<2*N-1;j++){
                bw.write("*");
            }
            if(i!=2*N-1){
                bw.newLine();
            }
        }
        br.close();
        bw.close();
    }
}
