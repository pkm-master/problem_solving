// https://www.acmicpc.net/problem/1436
import java.io.*;

public class MovieDirector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int number = 666;

        while (cnt<N){
            if (String.valueOf(number).contains("666")){
                cnt+=1;
            }
            number+=1;

        }
        bw.write(String.valueOf(number-1));
        br.close();
        bw.close();
    }
}
