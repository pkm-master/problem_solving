//https://www.acmicpc.net/problem/5597

import java.io.*;

public class homework{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] studnets = new int[30];

        for (int i =0 ; i<28 ; i++){
            int student = Integer.parseInt(br.readLine());
            studnets[student-1]= 1;
        }

        for (int i =0; i<30 ; i++){
            int number = studnets[i];
            if (number == 0){
                bw.write(String.valueOf(i+1)+'\n');
            }
        }

        br.close();
        bw.close();


    }
}