// https://www.acmicpc.net/problem/1620

import java.io.*;
import java.util.*;

public class PokemonMaster {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk1.nextToken());
        int M = Integer.parseInt(stk1.nextToken());

        HashMap<Integer,String> pkms = new HashMap<Integer,String>();
        HashMap<String,Integer> reverse = new HashMap<String,Integer>();

        for (int i=1;i<=N;i++){
            String pkmon = br.readLine();
            pkms.put(i,pkmon);
            reverse.put(pkmon,i);
        }

        for (int j=0;j<M;j++){
            String problem = br.readLine();
            if (reverse.containsKey(problem)){
                bw.write(String.valueOf(reverse.get(problem)));
            }
            else{
                bw.write(pkms.get(Integer.parseInt(problem)));
            }
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
