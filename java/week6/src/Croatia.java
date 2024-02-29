// https://www.acmicpc.net/problem/2941
import java.io.*;

public class Croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] CA = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String word = br.readLine();

        for (int i = 0;i<CA.length;i++){
            word = word.replaceAll(CA[i], "C");
        }
        bw.write(String.valueOf(word.length()));

        br.close();
        bw.close();

    }
}
