package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준4504번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        while (true) {
            int b = Integer.parseInt(br.readLine());

            if (b == 0) break;

            if (b % a == 0)
                System.out.println(b + " is a multiple of " + a + ".");
            else
                System.out.println(b + " is NOT a multiple of " + a + ".");
        }
    }
}
