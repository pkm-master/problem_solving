//https://www.acmicpc.net/problem/10809

import java.io.*;

public class FindAlphabet{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] alpha_list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (int i = 0 ; i < alpha_list.length ; i++){
            bw.write(String.valueOf(word.indexOf(alpha_list[i])));
            bw.write(' ');
        }

        br.close();
        bw.close();
    }
}