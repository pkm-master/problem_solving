//https://www.acmicpc.net/problem/9086

import java.io.*;

public class strings2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());
        for (int i =0 ; i < test_case; i++){
            String str = br.readLine();
            int str_len = str.length();

            bw.write(str.charAt(0));
            bw.write(str.charAt(str_len-1));
            bw.write('\n');
        }

        bw.close();
        br.close();

    }
}
