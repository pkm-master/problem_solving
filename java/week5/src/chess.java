//https://www.acmicpc.net/problem/3003

import java.io.*;

public class chess{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] or = {1,1,2,2,2,8} ;
        String[] pr = br.readLine().split(" ");

        for (int i=0;i<6;i++){
            bw.write(String.valueOf(or[i] - Integer.parseInt(pr[i])));
            bw.write(" ");
            
        }
        br.close();
        bw.close();

    }
}