//https://www.acmicpc.net/problem/10798
import java.io.*;

public class ReadArr {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[5][16];

        for ( int i=0 ; i<5 ; i++){
            String ls = br.readLine();
            for ( int j=0; j<ls.length(); j++){
                arr[i][j] = ls.charAt(j);
            }
        }

        for (int j=0; j<16 ; j++){
            for (int i=0; i<5 ; i++){
                if ((int)arr[i][j] >= 48){
                    bw.write(arr[i][j]);
                }
            }
        }

        br.close();
        bw.close();
    }
    
}
