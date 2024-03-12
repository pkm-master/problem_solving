//https://www.acmicpc.net/submit/2738

import java.io.*;

public class ArrSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ls = br.readLine().split(" ");
        int N = Integer.parseInt(ls[0]);
        int M = Integer.parseInt(ls[1]);

        int[][] arrA = new int[N][M]; 
        int[][] arrB = new int[N][M]; 

        for (int i=0 ; i<N ; i++ ){
            String[] nls = br.readLine().split(" ");
            for (int j=0; j<M; j++){
                arrA[i][j] = Integer.parseInt(nls[j]);
            }
        }

        for (int i=0 ; i<N ; i++ ){
            String[] nls = br.readLine().split(" ");
            for (int j=0; j<M; j++){
                arrB[i][j] = Integer.parseInt(nls[j]);
            }
        }

        for (int i=0; i<N; i++){
            for (int j=0; j<M ; j++){
                bw.write(String.valueOf(arrA[i][j] + arrB[i][j]));
                bw.write(" ");
            }
            bw.newLine();
        }
        
        br.close();
        bw.close();
    }
}
