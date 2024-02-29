// https://www.acmicpc.net/problem/1316
import java.io.*;

public class GroupWordCheck {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i<N; i++){
            boolean checker = true;
            int[] cnt = new int[26];
            String word = br.readLine();
            for(int j = 0; j<word.length();j++){
                char ch = word.charAt(j);
                if (cnt[(int)ch - (int)'a']!=0 && word.charAt(j) != word.charAt(j-1)){
                    checker = false;
                    break;
                }
                else{
                    cnt[(int)ch - (int)'a']+=1;
                }
            }
            if (checker){
                ans+=1;
            }
        }
        bw.write(String.valueOf(ans));

        br.close();
        bw.close();
    }
}
