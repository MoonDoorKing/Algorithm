package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준10039번 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for(int i=0;i<5;i++) {
            int a = Integer.parseInt(br.readLine());

            sum += Math.max(a, 40);
        }
        System.out.println(sum/5);
    }
}
