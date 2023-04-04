package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준25704번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        int result = p;

        for (int i = 1; i <= 4; i++) {
            if (i * 5 > n) break;
            switch (i) {
                case 1:
                    result = Math.min(result, p - 500);
                    break;
                case 2:
                    result = Math.min(result, (int) (p * 0.9));
                    break;
                case 3:
                    result = Math.min(result, p - 2000);
                    break;
                case 4:
                    result = Math.min(result, (int) (p * 0.75));
                    break;
            }
        }
        System.out.println(result < 0 ? 0 : result);
    }
}
