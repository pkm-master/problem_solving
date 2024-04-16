// https://www.acmicpc.net/problem/10816
import java.io.*;
import java.util.*;

public class NumCard {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk1 = new StringTokenizer(br.readLine());
        
        HashMap<Integer,Integer> cards = new HashMap<Integer,Integer>();
        for (int i=0;i<N;i++){
            int key = Integer.parseInt(stk1.nextToken());
            cards.put(key , cards.getOrDefault(key,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stk2 = new StringTokenizer(br.readLine());
        for (int j=0;j<M;j++){
            int card = Integer.parseInt(stk2.nextToken());
            int card_num;
            if (cards.get(card) == null){
                card_num = 0;
            }
            else{
                card_num = cards.get(card);
            }

            bw.write(String.valueOf(card_num));
            bw.write(" ");
        }
        
        br.close();
        bw.close();

    }
}
