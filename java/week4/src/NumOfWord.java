//https://www.acmicpc.net/problem/1152

import java.io.*;

public class NumOfWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String txt = br.readLine().strip();
        if (txt == ""){
            bw.write(String.valueOf(0));
        } 
        else{
            String[] txts = txt.split(" ");
            bw.write(String.valueOf(txts.length));
        }

        br.close();
        bw.close();
    }
}
