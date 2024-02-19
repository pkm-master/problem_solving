//https://www.acmicpc.net/problem/5622
import java.io.*;

public class dial {
    public static void main(String[] args)throws IOException{
        char[][] nums ={{'A','B','C','-'},{'D','E','F','-'},{'G','H','I','-'},{'J','K','L','-'},{'M','N','O','-'},{'P','Q','R','S'},{'T','U','V','-'},{'W','X','Y','Z'}};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int number = 0;

        for(int i = 0 ; i<word.length(); i++){
            for (int j=0; j<8; j++){
                for(int k=0; k<4; k++){
                    if (word.charAt(i) == nums[j][k]){
                        number += (j+3);
                    }
                }

                }
            }

        bw.write(String.valueOf(number));
        br.close();
        bw.close();

        }

    }
