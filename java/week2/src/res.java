//https://www.acmicpc.net/problem/3052

import java.io.*;
import java.util.*;


public class res {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] res_onoff = new int[42];
        
        int input_num = 0;
        for(int i =0; i<10; i++){
            input_num = Integer.parseInt(br.readLine());
            res_onoff[input_num%42] = 1;
        }
        int answer = Arrays.stream(res_onoff).sum();

        bw.write(String.valueOf(answer));

        br.close();
        bw.close();

    }
}
