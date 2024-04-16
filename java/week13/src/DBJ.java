// https://www.acmicpc.net/problem/1764
import java.util.*;
import java.io.*;

public class DBJ {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        HashSet<String> cannotHear = new HashSet<String>();
        HashSet<String> cannotSee = new HashSet<String>();

        for (int i=0;i<N;i++){
            cannotHear.add(br.readLine());
        }
        
        for (int j=0;j<M;j++){
            cannotSee.add(br.readLine());
        }

        cannotHear.retainAll(cannotSee);

        ArrayList<String> cannotHearSee = new ArrayList<String>(cannotHear);
        Collections.sort(cannotHearSee);

        bw.write(String.valueOf(cannotHearSee.size()));
        bw.newLine();
        for (String el:cannotHearSee){
            bw.write(el);
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
