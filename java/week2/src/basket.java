//https://www.acmicpc.net/problem/10811

import java.util.*;
import java.io.*;


public class basket {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer NM = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        int[] arr = new int[N];

        for (int num1 = 0; num1 < N; num1++){
            arr[num1] = num1+1;
        }

        for (int num2 = 0; num2<M ; num2++){
            StringTokenizer ij = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(ij.nextToken())-1;
            int j = Integer.parseInt(ij.nextToken())-1;
            int num3 = 0;
            while (i+num3 < j-num3){
                int save = arr[i+num3];
                arr[i+num3] = arr[j-num3];
                arr[j-num3] = save;
                num3 +=1;
            }

        }
        
        for (int idx = 0 ; idx < N ; idx ++){
            bw.write(String.valueOf(arr[idx])+" ");
        }
        
        bw.close();
        br.close();


    }
}
