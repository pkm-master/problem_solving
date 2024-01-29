import java.io.*;

public class max {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total_num = 9;
        int max_val = 0;
        int max_idx = 0;

        for (int i = 1; i<=total_num ; i++){
            int number = Integer.parseInt(br.readLine());
            if (max_val < number){
                max_val = number;
                max_idx = i;
            }

        }

        bw.write(String.valueOf(max_val));
        bw.write(String.valueOf('\n'));
        bw.write(String.valueOf(max_idx));
        br.close();
        bw.close();
        

    }
}
