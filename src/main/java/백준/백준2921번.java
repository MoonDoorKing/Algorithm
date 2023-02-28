package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2921번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        // 00 01 11 02 12 22
        int cnt = 0;

        for (int i = 0; i <= a; i++) {
            for (int d = i; d <= a; d++) {
                cnt += i + d;
            }
        }
        System.out.println(cnt);
    }
}
