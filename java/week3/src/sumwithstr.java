//https://www.acmicpc.net/problem/11720

import java.io.*;

public class sumwithstr {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int total = 0;
        
        for (int i = 0 ; i< num ; i++){
            total = total + Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        bw.write(String.valueOf(total));

        br.close();
        bw.close();

    }
}
