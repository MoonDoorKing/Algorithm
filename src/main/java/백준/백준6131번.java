package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준6131번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=1; i<=500; i++) {
            double a = Math.pow(i,2);
            for(int d=1; d<=500; d++) {
                double b = Math.pow(d,2);

                if(a-b == n) result ++;
            }
        }
        System.out.println(result);
    }
}
