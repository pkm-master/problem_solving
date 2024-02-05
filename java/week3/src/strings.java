//https://www.acmicpc.net/problem/27866

import java.io.*;

public class strings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int num = Integer.parseInt(br.readLine()) -1 ;
        char letter = str.charAt(num);
        
        bw.write(letter);
        
        br.close();
        bw.close();       
        
    }
}
