package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2720번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a; i++) {
            result.setLength(0);
            int b = Integer.parseInt(br.readLine());

            result.append(b / q).append(" ");
            b %= q;

            result.append(b / d).append(" ");
            b %= d;

            result.append(b / n).append(" ");
            b %= n;

            result.append(b / p).append(" ");

            System.out.println(result);
        }
    }
}
