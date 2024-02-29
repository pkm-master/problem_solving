// https://www.acmicpc.net/problem/25206
import java.io.*;
import java.util.*;

public class GradeCalc {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,Double> ref = new HashMap<String,Double>();
        ref.put("A+", 4.5);
        ref.put("A0", 4.0);
        ref.put("B+", 3.5);
        ref.put("B0", 3.0);
        ref.put("C+", 2.5);
        ref.put("C0", 2.0);
        ref.put("D+", 1.5);
        ref.put("D0", 1.0);
        ref.put("F", 0.0);

        double gradesum = 0;
        double nsum = 0;
        for (int i=0;i<20;i++){
            String[] grades = br.readLine().split(" ");
            if(grades[2].equals("P")){
                continue;
            }
            else{
                double score = ref.get(grades[2]) * Double.parseDouble(grades[1]);
                gradesum += score;
                nsum+=Double.parseDouble(grades[1]);
            }

        }
        bw.write(String.valueOf(gradesum/nsum));
        br.close();
        bw.close();
    }
}
