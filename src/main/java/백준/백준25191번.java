package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준25191번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int coke = Integer.parseInt(st.nextToken()); // 2
        int beer = Integer.parseInt(st.nextToken()); // 1

        System.out.println(Math.min(n, coke / 2 + beer));
    }
}
