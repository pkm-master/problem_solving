//https://www.acmicpc.net/problem/2908
import java.io.*;

public class ReverseN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");

        for(int i =0;i<2;i++){
            String Rev= "";

            for(int j=2;j>-1;j--){
                Rev += nums[i].charAt(j);
            }
            nums[i] = Rev;
        }

        int numa = Integer.parseInt(nums[0]);
        int numb = Integer.parseInt(nums[1]);

        if (numa>numb){
            bw.write(String.valueOf(numa));
        }
        else{
            bw.write(String.valueOf(numb));

        }

        br.close();
        bw.close();
    }
}
