package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준9086번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i=1; i<=a; i++) {
            String[] b = br.readLine().split("");
            System.out.println(b[0]+b[b.length-1]);

        }
    }
}
