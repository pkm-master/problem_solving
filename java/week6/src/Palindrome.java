// https://www.acmicpc.net/problem/10988
import java.io.*;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String w = br.readLine();
        char[] pal = new char[101];
        int top = -1;

        for (int i = 0;i<w.length();i++){
            if (w.length() % 2 == 1 && i == w.length()/2 ){
                continue;
            }
            
            if (top >=0 && pal[top] == w.charAt(i)){
                top -= 1;
            }
            else{
                top += 1;
                pal[top] = w.charAt(i);
            }
        }

        if (top>=0){
            bw.write('0');
        }
        else{
            bw.write('1');
        }

        br.close();
        bw.close();
    }
}
