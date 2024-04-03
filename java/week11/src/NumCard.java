//https://www.acmicpc.net/problem/10815
import java.io.*;
import java.util.*;

public class NumCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk1 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        Set<String> cards = new HashSet<String>();

        for(int i=0;i<N;i++){
            cards.add(stk1.nextToken());
        }

        for(int i=0;i<M;i++){
            if( cards.contains(nums[i])){
                bw.write('1');
                if (i<M-1){
                bw.write(' ');
                }
            }
            else{
                bw.write('0');
                if (i<M-1){
                    bw.write(' ');
                }
            }

        }
        bw.close();
        br.close();
    }
}
