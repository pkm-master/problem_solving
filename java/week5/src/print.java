//https://www.acmicpc.net/problem/11718

import java.io.*;

public class print{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        while ( st != null){
            
            bw.write(st);
            bw.newLine();

            st = br.readLine();
        }
        br.close();
        bw.close();
    }
}