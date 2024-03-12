//https://www.acmicpc.net/problem/2566
import java.io.*;

public class ArrMax {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max_i = 0;
        int max_j = 0;
        int max_val = 0;
        
        for (int i=0; i<9 ; i++){
            String[] ls = br.readLine().split(" ");
            for (int j=0; j<9 ; j++){
                if (max_val< Integer.parseInt(ls[j])){
                    max_val = Integer.parseInt(ls[j]);
                    max_i = i;
                    max_j = j;
                }
            }
        }

        bw.write(String.valueOf(max_val));
        bw.newLine();
        bw.write(String.valueOf(max_i+1));
        bw.write(" ");
        bw.write(String.valueOf(max_j+1));

        br.close();
        bw.close();
    }
    
}
