//https://www.acmicpc.net/problem/19532
import java.io.*;

public class MathClass {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ls = br.readLine().split(" ");
        
        for(int i=-999;i<=999;i++){
            for(int j=-999;j<=999;j++){
                if(Integer.parseInt(ls[0])*i + Integer.parseInt(ls[1])*j == Integer.parseInt(ls[2]) && Integer.parseInt(ls[3])*i + Integer.parseInt(ls[4])*j == Integer.parseInt(ls[5])){
                    bw.write(String.valueOf(i));
                    bw.write(" ");
                    bw.write(String.valueOf(j));
                    break;
                }
            }
        }
        bw.close();
        br.close();

    }
}
