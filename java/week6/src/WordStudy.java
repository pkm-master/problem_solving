import java.io.*;

public class WordStudy {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String w = br.readLine();
        int[] mu = new int[26];

        for (int i = 0 ; i < w.length(); i++){
            char ch = w.charAt(i);
            if ( 65<=(int)ch && (int)ch<=90 ){
                mu[(int)ch - (int)'A']+=1;
            }
            else{
                mu[(int)ch - (int)'a']+=1;
            }
        }
        
        int max_val = 0;
        char[] max_char = {'0','0'};
        
        for (int j = 0 ; j < mu.length; j++){
            if (max_val < mu[j]){
                max_val = mu[j];
                max_char[0] = (char)(65 + j);
                max_char[1] = '0';
            }
            else if (max_val == mu[j]){
                max_val = mu[j];
                max_char[1] = (char)(65+j);
            }
        }

        if (max_char[1] != '0'){
            bw.write('?');
        }
        else{
            bw.write(max_char[0]);
        }
        bw.close();
        br.close();
        
    }
}
