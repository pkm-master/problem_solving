//https://www.acmicpc.net/problem/2675

import java.io.*;
import java.util.*;

public class repeat {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < test_case ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(stk.nextToken());
            String txt = stk.nextToken();

            for (int j = 0; j<txt.length(); j++){
                bw.write(String.valueOf(txt.charAt(j)).repeat(num));
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
