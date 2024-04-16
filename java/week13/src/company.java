// https://www.acmicpc.net/problem/7785

import java.io.*;
import java.util.*;

public class company {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> peoples = new HashSet<String>();
        for (int i=0;i<N;i++){
            String[] people = br.readLine().split(" ");
            if (people[1].equals("enter")){
                peoples.add(people[0]);
            }
            else {
                peoples.remove(people[0]);
            }
        }

        ArrayList<String> people_ls = new ArrayList<String>(peoples);
        Collections.sort(people_ls);

        for (int j=people_ls.size()-1 ; j>=0 ; j-- ){
            bw.write(people_ls.get(j));
            if (j!=0){
                bw.newLine();
            }
        }

        br.close();
        bw.close();
        

    }
}
