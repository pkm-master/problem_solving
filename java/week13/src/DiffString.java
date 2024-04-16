// https://www.acmicpc.net/problem/11478
import java.io.*;
import java.util.*;

public class DiffString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        int N = s.length();

        HashSet<String> partialString = new HashSet<String>();

        for (int i=1;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                String part = s.substring(j, j+i);
                partialString.add(part);
            }
        }
        
        bw.write(String.valueOf(partialString.size()));
        br.close();
        bw.close();

    }
}
