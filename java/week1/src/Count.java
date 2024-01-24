// https://www.acmicpc.net/problem/10807

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Count {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_num = Integer.parseInt(br.readLine());
        String total_str = br.readLine();

        String[] total_case = total_str.split(" ");
        String target = br.readLine();
        br.close();
        
        int num = 0;

        for(int i=0;i<total_num;i++){
            if(total_case[i].equals(target)){
                num+=1;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num));
        bw.close();
        

    }
}
