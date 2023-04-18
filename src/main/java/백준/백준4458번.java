package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준4458번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++) {
            String[] b = br.readLine().split("");
            String result = "";
            for(int d=0; d<b.length; d++) {
               b[0] = b[0].toUpperCase();
               result += b[d];
           }
            System.out.println(result);
        }
    }
}
